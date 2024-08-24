package Raça

import Habilidades

class gnomo : Raca{
    override fun aplicarBonusRaca(habilidades: Habilidades) {
        habilidades.inteligencia += 2
    }
    override fun toString() : String {
        return "gnomo"
    }

}