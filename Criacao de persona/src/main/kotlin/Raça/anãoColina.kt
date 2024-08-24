package Raça

import Habilidades

class anãoColina : Raca{
    override fun aplicarBonusRaca(habilidades: Habilidades) {
        habilidades.sabedoria += 1
    }
    override fun toString() : String {
        return "anãoColina"
    }

}