package Cursos

import Estudante.Estudante

class Cursos (private val nomeCurso:String,
              private  var professorName:String,
              private val ano:Int) {
    val listaDeEstudante = mutableListOf<Estudante?>()


    fun listarEstudantes(){
        for (i in listaDeEstudante)
            println(i?.nome)
    }

    fun cadastrar(estudante: Estudante?) {
        listaDeEstudante+=estudante
        println("Cadastro Realizado Com Sucesso")
    }
    fun cadastrar(estudantes:Array<Estudante?>){
        if(estudantes!=null){
            for (i in estudantes){
                listaDeEstudante+=i
            }
        }
        println("Você não passou")
    }
    fun removerEstudante(estudante:Estudante?){
        if(listaDeEstudante.contains(estudante)){
            listaDeEstudante.remove(estudante)
            println("Estudante removido com sucesso")
        }else{
            println("Nome não encontrado ")
        }
    }


    fun numeroDeEstudantesCadastrados(){
        println("O numero de estudantes cadastrados é ${listaDeEstudante.size}")
    }

    fun melhorNota(){
        var melhorNota =listaDeEstudante[0]?.nota
        for (i in listaDeEstudante){
            if(i?.nota!! > melhorNota!!){
                melhorNota=i.nota
            }
        }
        println("A maior nota do curso foi $melhorNota")
    }

    fun verificaAluno(estudante: Estudante){
        if(listaDeEstudante.contains(estudante)){
            println(" Estudante Existe ")
        }else{
            throw Exception("O aluno não consta na lista ")
        }
    }

}