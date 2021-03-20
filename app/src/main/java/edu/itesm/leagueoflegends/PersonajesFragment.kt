package edu.itesm.leagueoflegends

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.os.persistableBundleOf
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_personajes.*

class PersonajesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_personajes, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        personajes_recycler.apply{
            layoutManager = LinearLayoutManager(activity)
            adapter = PersonajesAdapter(informacion())
        }
    }

    fun informacion(): ArrayList<personajes>{

        val personajesd = ArrayList<personajes>()
        personajesd.add(personajes(R.drawable.ahri, "Ahri", "Ahri, conectada de forma innata con el poder latente de Runaterra, es una vastaya que puede moldear la magia en orbes de energía pura. Se divierte jugueteando con su presa y manipulando sus emociones, antes de devorar su esencia vital. A pesar de su naturaleza predadora, Ahri conserva cierta empatía porque recibe destellos de los recuerdos de cada alma que consume.","Popularidad 7.1%"))
        personajesd.add(personajes(R.drawable.akali, "Akali","Tras renunciar a la Orden Kinkou y a su título como el Puño de la Sombra, Akali pelea a solas, lista para ser el arma letal que su pueblo necesita. Aunque conserva todo lo que aprendió de su maestro Shen, juró defender a Jonia de sus enemigos... una víctima a la vez. Puede que Akali ataque en silencio, pero su mensaje resonará con fuerza y claridad: témanle a la asesina sin maestro.","Popularidad 3.6%"))
        personajesd.add(personajes(R.drawable.ekko, "Ekko", "Ekko, un prodigio surgido de las duras calles de Zaun, es capaz de manipular el tiempo para su propio beneficio. Usando una máquina de su invención llamada Pulsar-Z, explora las distintas posibilidades de la realidad para crear el momento perfecto. Aunque adora su libertad, si algo amenaza a sus amigos hará lo que sea para defenderlos. Para quien no sepa quién es en realidad este muchacho, su capacidad de hacer lo imposible una y otra vez resulta increíble.", "Popularidad 10.5%"))
        personajesd.add(personajes(R.drawable.atrox, "Aatrox", "Aatrox y sus hermanos, que alguna vez fueron respetados defensores de Shurima contra el Vacío, se convirtieron en una amenaza aún mayor para Runaterra y los derrotaron con hechicería mortal usada con astucia. Pero, después de siglos de encarcelamiento, Aatrox fue el primero en encontrar la libertad una vez más; corrompió y transformó a los bastante tontos como para intentar blandir el arma mágica que contenía su esencia. Ahora, con cuerpos robados, camina por Runaterra con una apariencia retorcida de su forma original y busca la venganza apocalíptica que tanto desea.", "Popularidad 6.3%"))
        personajesd.add(personajes(R.drawable.blitzcrank, "Blitzcrank", "Blitzcrank es un autómata gigantesco y casi indestructible de Zaun, que originalmente fue creado para deshacerse de los desechos tóxicos. Sin embargo, él cree que su propósito principal era demasiado limitado, así que modificó su propia forma para poder servir mejor a la frágil gente del Sumidero. Blitzcrank utiliza su fuerza y durabilidad desinteresadamente para proteger a los demás, extendiendo su puño de metal o lanzando una ráfaga de energía para someter a quienes busquen causar problemas.", "Popularidad 6.7%"))
        personajesd.add(personajes(R.drawable.camille, "Camille", "Armada para operar fuera de los límites de la ley, Camille es la principal inteligencia del Clan Ferros: una elegante agente de élite que se asegura de que la máquina de Piltóver y el submundo zaunita funcione sin problemas. Al ser adaptable y precisa, ella ve las técnicas torpes como una vergüenza que necesita ponerse en línea. Con una mente tan brillante y afilada como las cuchillas que porta, la búsqueda de Camille por la superioridad a través de las mejoras de cuerpo de hextech, han hecho que la gente se pregunte si es más máquina que mujer.", "Popularidad 7.7%"))
        personajesd.add(personajes(R.drawable.amumu, "Amumu", "Cuenta la leyenda que Amumu es un alma solitaria y melancólica de la antigua Shurima que vaga por el mundo en busca de un amigo. Una antigua maldición lo condenó a permanecer solo por toda la eternidad. Sus caricias son la muerte, su afecto es la ruina. Quienes afirman haberlo visto lo describen como un cadáver viviente de corta estatura envuelto en vendajes. Amumu ha sido la inspiración de mitos, canciones y folclore que se han contado una y otra vez a lo largo de generaciones, tanto que es imposible separar la verdad de la ficción.", "Popularidad 1.7%"))
        personajesd.add(personajes(R.drawable.anivia, "Anivia", "Anivia es un espíritu benevolente alado que soporta interminables ciclos de vida, muerte y resurrección para proteger Fréljord. Nació de la unión del hielo cruel y del viento penetrante, por lo que es una semidiosa que utiliza esos poderes elementales para frustrar a quien se atreva a perturbar su tierra natal. Anivia guía y protege a las tribus del norte hostil, quienes la veneran como símbolo de esperanza y como presagio de un gran cambio. Pelea con cada fibra de su ser sabiendo que su recuerdo perdurará a través de su sacrificio y que renacerá en un nuevo mañana.", "Popularidad 6%"))
        personajesd.add(personajes(R.drawable.annie, "Annie", "Annie es una peligrosa, talentosa y encantadora niña maga que posee un inmenso poder piroquinético. Incluso bajo las sombras de las montañas al norte de Noxus, es una maga excepcional. Su afinidad innata con el fuego se manifestó pronto en su vida a través de explosiones emocionales impredecibles, aunque con el tiempo aprendió a controlar esos ''trucos''. Uno de sus favoritos es invocar a Tibbers, su amado osito de peluche, como una feroz bestia de fuego. Perdida en la perpetua inocencia de la niñez, Annie vaga por los bosques oscuros siempre en busca de alguien con quien jugar.", "Popularidad 3%"))
        personajesd.add(personajes(R.drawable.caitlyn, "Caitlyn", "Reconocida como la mejor pacificadora, Caitlyn también es la mejor oportunidad de Piltóver para deshacerse de los elementos criminales elusivos de su ciudad. A veces hace equipo con Vi y es un buen contrapunto para la naturaleza más impulsiva de su compañera. Aunque carga un rifle hextech único, el arma más poderosa de Caitlyn es su intelecto superior, el cual le permite tender trampas elaboradas para malhechores que son suficientemente tontos para operar en la Ciudad del Progreso.", "Popularidad 12.5%"))
        personajesd.add(personajes(R.drawable.ashe, "Ashe", "Como Hija del Hielo y madre de guerra de la tribu Avarosa, Ashe comanda la más grande horda en el norte. Estoica, inteligente e idealista, pero incómoda con su rol de líder, ella aprovecha las magias ancestrales de su linaje para portar un arco de Hielo Puro. Apoyada por la creencia de su gente que ella es el héroe mitológico reencarnado de Avarosa, Ashe espera unificar el Fréljord una vez más al retomar sus tierras antiguas y tribales.", "Popularidad 5.6%"))
        personajesd.add(personajes(R.drawable.azir, "Azir", "Azir, emperador de Shurima en un pasado remoto, fue un hombre orgulloso que estuvo a punto de alcanzar la inmortalidad. Dominado por la arrogancia, fue traicionado y asesinado en la hora de su mayor triunfo. Pero ahora, milenios después, renació como un ser Ascendido de inmenso poder. Su enterrada ciudad resurgió de las arenas y Azir está decidido a restaurar la antigua gloria de Shurima.", "Popularidad 1.8%"))
        personajesd.add(personajes(R.drawable.alistar, "Alistar", "Alistar, que desde siempre fue un gran guerrero con una temible reputación, busca venganza por la muerte de su clan a manos del imperio noxiano. Aunque haya sido esclavizado y forzado a tener una vida de gladiador, su voluntad inquebrantable fue lo que impidió que se convirtiera en una bestia completamente. Ahora, libre de las cadenas de sus anteriores amos, pelea en nombre de los desamparados y desprotegidos usando tanto su furia como sus cuernos, pezuñas y puños como armas.", "Popularidad 11.7%"))
        personajesd.add(personajes(R.drawable.bardo, "Bardo", "El Bardo es un viajero de un reino más allá de las estrellas y un agente de la serendipia quien lucha por conservar el balance donde sea que la vida resista la indiferencia del caos. Muchas canciones de Runaterra hablan sobre su extraordinaria naturaleza y todas ellas dicen que los artefactos de un inmenso poder mágico atraen al vagabundo cósmico. Rodeado por un alegre coro de espíritus de meeps, es imposible pensar que sus acciones son malévolas, ya que el Bardo siempre busca servir al bien de todos... a su extraña manera.", "Popularidad 5.9%"))
        personajesd.add(personajes(R.drawable.braum, "Braum", "Dotado de bíceps masivos y un corazón aún más grande, Braum es un querido héroe de Fréljord. Todas las tabernas al norte de Frostheld brindan por su fuerza legendaria; se dice que taló un bosque de robles en una sola noche y que hizo añicos una montaña entera con un solo golpe. Con una puerta de bóveda encantada como escudo, Braum vaga el norte congelado portando una sonrisa bigotona tan grande como sus músculos: un verdadero amigo para aquellos que lo necesitan.", "Popularidad 2.4%"))
        return personajesd
    }
}