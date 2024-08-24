package Raça

import Habilidades

class gnomoRocha : Raca{
    override fun aplicarBonusRaca(habilidades: Habilidades) {
        habilidades.constituicao += 1
    }
    override fun toString() : String {
        return "gnomoRocha"
    }

}