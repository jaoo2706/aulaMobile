package Raça

import Habilidades

class elfo : Raca{
    override fun aplicarBonusRaca(habilidades: Habilidades) {
        habilidades.destreza += 2
    }
    override fun toString() : String {
        return "elfo"
    }
}