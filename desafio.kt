// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
    inscritos.add(usuario)
        println("usuario ${usuario.nome} matriculado na Formacao $nome"}
    }
}

fun main() {
    // Criando alguns conteúdos educacionais
    val conteudo1 = ConteudoEducacional("Introdução á programação", 60)
    val conteudo2 = ConteudoEducacional("Estruturas de Dados", 90)
    val conteudo3 = ConteudoEducacional("Algoritmos Avançados", 120)

    // Criando uma formação
    val Formacao = Formacao("Desenvolvimento de software", Nivel.INTERMEDIARIO, listOf(conteudo1, conteudo2, conteudo3))

    //Criando alguns usuários
    val usuario1 = Usuario("Jesus")
    val usuario2 = Usuario("Óscar")

    // Realizando as matriculas 
    Formacao.matricular(usuario1)
    Formacao.matricular(usuario2)   
}
