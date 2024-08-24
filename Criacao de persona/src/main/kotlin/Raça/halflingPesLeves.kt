package Raça

import Habilidades

class halflingPesLeves : Raca{
    override fun aplicarBonusRaca(habilidades: Habilidades) {
        habilidades.carisma += 1
    }
    override fun toString() : String {
        return "halflingPesLeves"
    }

}