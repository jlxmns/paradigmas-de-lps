package singleton

import (
	"fmt"
	"sync"
)

var lock = &sync.Mutex{}

type Singleton struct {
}

var singleInstance *Singleton

func GetInstance() *Singleton {
	if singleInstance == nil {
		lock.Lock()
		defer lock.Unlock()
		if singleInstance == nil {
			fmt.Println("Criando uma nova instância.")
			singleInstance = &Singleton{}
		} else {
			fmt.Println("Instância singleton já criada.")
		}
	} else {
		fmt.Println("Instância singleton já criada.")
	}

	return singleInstance
}
