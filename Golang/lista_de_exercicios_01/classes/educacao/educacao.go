package educacao

import "strings"

type Professor struct {
	Nome    string
	Escolas []*Escola
}

type Escola struct {
	Nome        string
	Professores []*Professor
}

func NewEscola(nome string) *Escola {
	return &Escola{Nome: nome}
}

func NewProfessor(nome string) *Professor {
	return &Professor{Nome: nome}
}

func (e *Escola) ContainsProfessor(professor *Professor) bool {
	for _, p := range e.Professores {
		if p.Nome == professor.Nome {
			return true
		}
	}
	return false
}

func (p *Professor) ContainsEscola(escola *Escola) bool {
	for _, e := range p.Escolas {
		if e.Nome == escola.Nome {
			return true
		}
	}
	return false
}

func (e *Escola) AddProfessor(professor *Professor) {
	if !e.ContainsProfessor(professor) {
		e.Professores = append(e.Professores, professor)
		AddEscolaToProfessor(professor, e)
	}
}

func (p *Professor) AddEscola(escola *Escola) {
	if !p.ContainsEscola(escola) {
		p.Escolas = append(p.Escolas, escola)
		AddProfessorToEscola(escola, p)
	}
}

func AddEscolaToProfessor(p *Professor, e *Escola) {
	if !p.ContainsEscola(e) {
		p.Escolas = append(p.Escolas, e)
	}
}

func AddProfessorToEscola(e *Escola, p *Professor) {
	if !e.ContainsProfessor(p) {
		e.Professores = append(e.Professores, p)
	}
}

func (e *Escola) GetProfessores() string {
	var nomes []string
	for _, prof := range e.Professores {
		nomes = append(nomes, prof.Nome)
	}
	resultado := strings.Join(nomes, ", ")
	return resultado
}

func (p *Professor) GetEscolas() string {
	var nomes []string
	for _, escola := range p.Escolas {
		nomes = append(nomes, escola.Nome)
	}
	resultado := strings.Join(nomes, ", ")
	return resultado
}
