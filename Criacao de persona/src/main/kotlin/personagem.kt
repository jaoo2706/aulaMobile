import Raça.*
import kotlin.random.Random

class personagem {
    private var habilidades = Habilidades()
    private var modificadores = Modificadores()
    fun criarPersonagem(){
        while (true) {
            while(true) {
                var pontos = 27

                println("Você irá criar seu personagem! Você terá 27 pontos para distribuir entre seus atributos.")
                while(true) {
                    if (habilidades.forca == 15){
                        break
                    }
                    println("Você tem " + pontos + " pontos")
                    println("Quantos pontos você quer colocar em força?")
                    val valor = readLine()!!.toInt()
                    if (valor <= 5) {
                        habilidades.forca += valor
                        pontos -= valor
                        break
                    } else if (valor == 7) {
                        habilidades.forca += valor - 1
                        pontos -= valor
                        break
                    } else if (valor == 9) {
                        habilidades.forca += valor - 2
                        pontos -= valor

                        break
                    } else {
                        println("Valor não pode ser 6, 8 e nem maior que 9")
                    }
                }
                while(true) {
                    if (habilidades.destreza == 15){
                        break
                    }
                    println("Você tem " + pontos + " pontos")
                    println("Quantos pontos você quer colocar em destreza?")
                    val valor = readLine()!!.toInt()
                    if (valor <= 5) {
                        habilidades.destreza += valor
                        pontos -= valor
                        break
                    } else if (valor == 7) {
                        habilidades.destreza += valor - 1
                        pontos -= valor
                        break
                    } else if (valor == 9) {
                        habilidades.destreza += valor - 2
                        pontos -= valor

                        break
                    } else {
                        println("Valor não pode ser 6, 8 e nem maior que 9")
                    }
                }
                while(true) {
                    if (habilidades.inteligencia == 15){
                        break
                    }
                    println("Você tem " + pontos + " pontos")
                    println("Quantos pontos você quer colocar em inteligencia?")
                    val valor = readLine()!!.toInt()
                    if (valor <= 5) {
                        habilidades.inteligencia += valor
                        pontos -= valor
                        break
                    } else if (valor == 7) {
                        habilidades.inteligencia += valor - 1
                        pontos -= valor
                        break
                    } else if (valor == 9) {
                        habilidades.inteligencia += valor - 2
                        pontos -= valor

                        break
                    } else {
                        println("Valor não pode ser 6, 8 e nem maior que 9")
                    }
                }
                while(true) {
                    if (habilidades.carisma == 15){
                        break
                    }
                    println("Você tem " + pontos + " pontos")
                    println("Quantos pontos você quer colocar em carisma?")
                    val valor = readLine()!!.toInt()
                    if (valor <= 5) {
                        habilidades.carisma += valor
                        pontos -= valor
                        break
                    } else if (valor == 7) {
                        habilidades.carisma += valor - 1
                        pontos -= valor
                        break
                    } else if (valor == 9) {
                        habilidades.carisma += valor - 2
                        pontos -= valor

                        break
                    } else {
                        println("Valor não pode ser 6, 8 e nem maior que 9")
                    }
                }
                while(true) {
                    if (habilidades.constituicao == 15){
                        break
                    }
                    println("Você tem " + pontos + " pontos")
                    println("Quantos pontos você quer colocar em constituição?")
                    val valor = readLine()!!.toInt()
                    if (valor <= 5) {
                        habilidades.constituicao += valor
                        pontos -= valor
                        break
                    } else if (valor == 7) {
                        habilidades.constituicao += valor - 1
                        pontos -= valor
                        break
                    } else if (valor == 9) {
                        habilidades.constituicao += valor - 2
                        pontos -= valor

                        break
                    } else {
                        println("Valor não pode ser 6, 8 e nem maior que 9")
                    }
                }
                while(true) {
                    if (habilidades.sabedoria == 15){
                        break
                    }
                    println("Você tem " + pontos + " pontos")
                    println("Quantos pontos você quer colocar em sabedoria?")
                    val valor = readLine()!!.toInt()
                    if (valor <= 5) {
                        habilidades.sabedoria += valor
                        pontos -= valor
                        break
                    } else if (valor == 7) {
                        habilidades.sabedoria += valor - 1
                        pontos -= valor
                        break
                    } else if (valor == 9) {
                        habilidades.sabedoria += valor - 2
                        pontos -= valor

                        break
                    } else {
                        println("Valor não pode ser 6, 8 e nem maior que 9")
                    }
                }



                if (pontos > 0){
                    println("Você ainda tem " + pontos + " pontos, deseja incluir esses pontos em alguma outra habilidade?")
                    val verificacao = readLine()
                    if (verificacao == "sim") {
                        continue
                    }
                    else{
                        break
                    }
                }
                else{
                    break
                }
            }
            val racas = mapOf(
                1 to anão(),
                2 to anãoColina(),
                3 to anãoMontanha(),
                4 to elfo(),
                5 to elfoFloresta(),
                6 to altoElfo(),
                7 to meioElfo(),
                8 to draconato(),
                9 to drow(),
                10 to gnomo(),
                11 to gnomoRocha(),
                12 to gnomoFloresta(),
                13 to halfling(),
                14 to halflingPesLeves(),
                15 to halflingRobusto(),
                16 to humano(),
                17 to meioOrc(),
                18 to tiefling(),
            )

            println("Qual raca você deseja ser?")
            racas.forEach { (key, value) -> println("$key - $value") }
            val escolharaca = readLine()?.toIntOrNull()
            val racaselecionada = racas[escolharaca]
            if (racaselecionada != null) {
                racaselecionada.aplicarBonusRaca(habilidades)
            }

            modificadores.forca = when (habilidades.forca){
                8, 9 -> -1
                10, 11 -> 0
                12, 13 -> 1
                14, 15 -> 2
                16, 17 -> 3
                18, 19 -> 4
                else -> 0
            }
            modificadores.destreza = when (habilidades.destreza){
                8, 9 -> -1
                10, 11 -> 0
                12, 13 -> 1
                14, 15 -> 2
                16, 17 -> 3
                18, 19 -> 4
                else -> 0
            }
            modificadores.inteligencia = when (habilidades.inteligencia){
                8, 9 -> -1
                10, 11 -> 0
                12, 13 -> 1
                14, 15 -> 2
                16, 17 -> 3
                18, 19 -> 4
                else -> 0
            }
            modificadores.carisma = when (habilidades.carisma){
                8, 9 -> -1
                10, 11 -> 0
                12, 13 -> 1
                14, 15 -> 2
                16, 17 -> 3
                18, 19 -> 4
                else -> 0
            }
            modificadores.constituicao = when (habilidades.constituicao){
                8, 9 -> -1
                10, 11 -> 0
                12, 13 -> 1
                14, 15 -> 2
                16, 17 -> 3
                18, 19 -> 4
                else -> 0
            }
            modificadores.sabedoria = when (habilidades.sabedoria){
                8, 9 -> -1
                10, 11 -> 0
                12, 13 -> 1
                14, 15 -> 2
                16, 17 -> 3
                18, 19 -> 4
                else -> 0
            }

            break
        }
    }

    fun mostrarStatus(){
        println("Habilidades: $habilidades")
    }
    fun mostrarModificadores(){
        println("Modificadores: $modificadores")
    }
    fun mostrarVida(){
        val vida = 10 + modificadores.constituicao
        println("Vida: " + vida)
    }
    fun darSoco(){
        val numeroAleatorio = Random.nextInt(1, 7)
        var acerto = numeroAleatorio + modificadores.forca
        if (acerto > 0) {
            println("Acertou! Você deu " + acerto + " de dano")
        }
        else{
            println("Errou!")
            }
        }
    }
