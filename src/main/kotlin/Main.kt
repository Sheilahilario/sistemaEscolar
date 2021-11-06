import Cursos.Cursos
import Estudante.Estudante

fun main(args: Array<String>) {


    val matheus:Estudante= Estudante("Uyara","Camaro",3,80.0,2)
    val caio:Estudante= Estudante("Diego","Lima",2,70.0,3)
    val Allan:Estudante= Estudante("Alexa","Oliveira",4,90.0,1)

    val cursoIngles:Cursos = Cursos("Ingles","João",2)

    cursoIngles.cadastrar(matheus)
    cursoIngles.cadastrar(caio)
    cursoIngles.numeroDeEstudantesCadastrados()
    cursoIngles.removerEstudante(caio)

    try {
        cursoIngles.verificaAluno(matheus)
    }catch (e:Exception){
        println(e.message)
    }
}