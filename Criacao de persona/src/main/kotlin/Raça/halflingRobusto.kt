package Raça

import Habilidades

class halflingRobusto : Raca{
    override fun aplicarBonusRaca(habilidades: Habilidades) {
        habilidades.constituicao += 1
    }
    override fun toString() : String {
        return "halflingRobusto"
    }

}