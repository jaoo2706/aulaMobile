package Raça

import Habilidades

class meioElfo : Raca{
    override fun aplicarBonusRaca(habilidades: Habilidades) {
        habilidades.carisma += 2
    }
    override fun toString() : String {
        return "meioElfo"
    }

}