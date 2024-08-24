package Raça

import Habilidades

class tiefling : Raca{
    override fun aplicarBonusRaca(habilidades: Habilidades) {
        habilidades.carisma += 2
        habilidades.inteligencia += 1
    }
    override fun toString() : String {
        return "tiefling"
    }

}