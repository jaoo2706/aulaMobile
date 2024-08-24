package Raça

import Habilidades

class anão : Raca{
    override fun aplicarBonusRaca(habilidades: Habilidades) {
        habilidades.constituicao += 2
    }

    override fun toString() : String {
        return "anão"
    }

}