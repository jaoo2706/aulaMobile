package Raça

import Habilidades

class gnomoFloresta : Raca{
    override fun aplicarBonusRaca(habilidades: Habilidades) {
        habilidades.destreza += 1
    }
    override fun toString() : String {
        return "gnomoFloresta"
    }

}