package Raça

import Habilidades

class drow : Raca{
    override fun aplicarBonusRaca(habilidades: Habilidades) {
        habilidades.carisma += 1
    }
    override fun toString() : String {
        return "drow"
    }

}