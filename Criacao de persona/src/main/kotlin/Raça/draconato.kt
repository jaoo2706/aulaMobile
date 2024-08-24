package Raça

import Habilidades

class draconato : Raca{
    override fun aplicarBonusRaca(habilidades: Habilidades) {
        habilidades.forca += 2
        habilidades.carisma +=2
    }
    override fun toString() : String {
        return "draconato"
    }

}