package Raça

import Habilidades

class altoElfo : Raca{
    override fun aplicarBonusRaca(habilidades: Habilidades) {
        habilidades.inteligencia += 1
    }
    override fun toString() : String {
        return "altoElfo"
    }

}