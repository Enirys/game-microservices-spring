package com.enirys.enirysagentsservice;

import com.enirys.enirysagentsservice.entities.Agent;
import com.enirys.enirysagentsservice.enums.RoleType;
import com.enirys.enirysagentsservice.repositories.AgentsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EnirysAgentsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnirysAgentsServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(AgentsRepository agentsRepository)
    {
        return args -> {
            agentsRepository.save(new Agent(null, "Brimstone", "Joining from the USA, Brimstone's orbital arsenal ensures his squad always has the advantage. His ability to deliver utility precisely and from a distance make him an unmatched boots-on-the-ground commander.", RoleType.Controller));
            agentsRepository.save(new Agent(null, "Pheonix", "Hailing from the U.K., Phoenix's star power shines through in his fighting style, igniting the battlefield with flash and flare. Whether he's got backup or not, he'll rush into a fight on his own terms.", RoleType.Duelist));
            agentsRepository.save(new Agent(null, "Sage", "The stronghold of China, Sage creates safety for herself and her team wherever she goes. Able to revive fallen friends and stave off aggressive pushes, she provides a calm center to a hellish fight.", RoleType.Sentinel));
            agentsRepository.save(new Agent(null, "Sova", "Born from the eternal winter of Russia's tundra, Sova tracks, finds, and eliminates enemies with ruthless efficiency and precision. His custom bow and incredible scouting abilities ensure that even if you run, you cannot hide.", RoleType.Initiator));
            agentsRepository.save(new Agent(null, "Viper", "The American chemist, Viper deploys an array of poisonous chemical devices to control the battlefield and cripple the enemy's vision. If the toxins don't kill her prey, her mind games surely will.", RoleType.Controller));
            agentsRepository.save(new Agent(null, "Cypher", "The Moroccan information broker, Cypher is a one-man surveillance network who keeps tabs on the enemy's every move. No secret is safe. No maneuver goes unseen. Cypher is always watching.", RoleType.Sentinel));
            agentsRepository.save(new Agent(null, "Reyna", "Forged in the heart of Mexico, Reyna dominates single combat, popping off with each kill she scores. Her capability is only limited by her raw skill, making her highly dependent on performance.", RoleType.Duelist));
            agentsRepository.save(new Agent(null, "Killjoy", "The genius of Germany. Killjoy secures the battlefield with ease using her arsenal of inventions. If the damage from her gear doesn't stop her enemies, her robots' debuff will help make short work of them.", RoleType.Sentinel));
            agentsRepository.save(new Agent(null, "Breach", "Breach, the bionic Swede, fires powerful, targeted kinetic blasts to aggressively clear a path through enemy ground. The damage and disruption he inflicts ensures no fight is ever fair.", RoleType.Initiator));
            agentsRepository.save(new Agent(null, "Omen", "A phantom of a memory, Omen hunts in the shadows. He renders enemies blind, teleports across the field, then lets paranoia take hold as his foe scrambles to learn where he might strike next.", RoleType.Controller));
            agentsRepository.save(new Agent(null, "Jett", "Representing her home country of South Korea, Jett's agile and evasive fighting style lets her take risks no one else can. She runs circles around every skirmish, cutting enemies before they even know what hit them.", RoleType.Duelist));
            agentsRepository.save(new Agent(null, "Raze", "Raze explodes out of Brazil with her big personality and big guns. With her blunt-force-trauma playstyle, she excels at flushing entrenched enemies and clearing tight spaces with a generous dose of boom.", RoleType.Duelist));
            agentsRepository.save(new Agent(null, "Skye", "Hailing from Australia, Skye and her band of beasts trail-blaze the way through hostile territory. With her creations hampering the enemy, and her power to heal others, the team is strongest and safest by Skye’s side.", RoleType.Initiator));
            agentsRepository.save(new Agent(null, "Yoru", "Japanese native, Yoru, rips holes straight through reality to infiltrate enemy lines unseen. Using deception and aggression in equal measure, he gets the drop on each target before they know where to look.", RoleType.Duelist));
            agentsRepository.save(new Agent(null, "Astra", "Ghanaian Agent Astra harnesses the energies of the cosmos to reshape battlefields to her whim. With full command of her astral form and a talent for deep strategic foresight, she's always eons ahead of her enemy's next move.", RoleType.Controller));
            agentsRepository.save(new Agent(null, "Kayo", "KAY/O is a machine of war built for a single purpose: neutralizing radiants. His power to suppress enemy abilities cripples his opponents' capacity to fight back, securing him and his allies the ultimate edge.", RoleType.Initiator));
            agentsRepository.save(new Agent(null, "Chamber", "Well dressed and well armed, French weapons designer Chamber expels aggressors with deadly precision. He leverages his custom arsenal to hold the line and pick off enemies from afar, with a contingency built for every plan.", RoleType.Sentinel));
            agentsRepository.save(new Agent(null, "Neon", "Filipino Agent Neon surges forward at shocking speeds, discharging bursts of bioelectric radiance as fast as her body generates it. She races ahead to catch enemies off guard, then strikes them down quicker than lightning.", RoleType.Duelist));
            agentsRepository.save(new Agent(null, "Fade", "Turkish bounty hunter, Fade, unleashes the power of raw nightmares to seize enemy secrets. Attuned with terror itself, she hunts targets and reveals their deepest fears—before crushing them in the dark.", RoleType.Initiator));
        };
    }

}
