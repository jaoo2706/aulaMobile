package Raça

import Habilidades

class meioOrc : Raca{
    override fun aplicarBonusRaca(habilidades: Habilidades) {
        habilidades.forca += 2
        habilidades.constituicao += 1
    }
    override fun toString() : String {
        return "meioOrc"
    }

}