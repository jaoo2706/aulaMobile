package Raça

import Habilidades

class halfling : Raca{
    override fun aplicarBonusRaca(habilidades: Habilidades) {
        habilidades.destreza += 2
    }
    override fun toString() : String {
        return "halfling"
    }

}