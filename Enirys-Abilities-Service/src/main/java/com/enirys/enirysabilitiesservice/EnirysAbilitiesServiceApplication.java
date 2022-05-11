package com.enirys.enirysabilitiesservice;

import com.enirys.enirysabilitiesservice.entities.Ability;
import com.enirys.enirysabilitiesservice.repositories.AbilitiesRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EnirysAbilitiesServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnirysAbilitiesServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(AbilitiesRepository abilitiesRepository)
    {
        return args -> {
            abilitiesRepository.save(new Ability(null, 1L, "Incendiary", "EQUIP an incendiary grenade launcher. FIRE to launch a grenade that detonates as it comes to a rest on the floor, creating a lingering fire zone that damages players within the zone.", 0.0));
            abilitiesRepository.save(new Ability(null, 1L, "Sky Smoke", "EQUIP a tactical map. FIRE to set locations where Brimstone’s smoke clouds will land. ALTERNATE FIRE to confirm, launching long-lasting smoke clouds that block vision in the selected area.", 0.0));
            abilitiesRepository.save(new Ability(null, 1L, "Stim Beacon", "EQUIP a stim beacon. FIRE to toss the stim beacon in front of Brimstone. Upon landing, the stim beacon will create a field that grants players RapidFire.", 0.0));
            abilitiesRepository.save(new Ability(null, 1L, "Orbital Strike", "EQUIP a tactical map. FIRE to launch a lingering orbital strike laser at the selected location, dealing high damage-over-time to players caught in the selected area.", 0.0));

            abilitiesRepository.save(new Ability(null, 2L, "Curveball", "EQUIP a flare orb that takes a curving path and detonates shortly after throwing. FIRE to curve the flare orb to the left, detonating and blinding any player who sees the orb. ALTERNATE FIRE to curve the flare orb to the right.", 0.0));
            abilitiesRepository.save(new Ability(null, 2L, "Hot Hands", "EQUIP a fireball. FIRE to throw a fireball that explodes after a set amount of time or upon hitting the ground, creating a lingering fire zone that damages enemies.", 0.0));
            abilitiesRepository.save(new Ability(null, 2L, "Blaze", "EQUIP a flame wall. FIRE to create a line of flame that moves forward, creating a wall of fire that blocks vision and damages players passing through it. HOLD FIRE to bend the wall in the direction of your crosshair.", 0.0));
            abilitiesRepository.save(new Ability(null, 2L, "Run It Back", "INSTANTLY place a marker at Phoenix’s location. While this ability is active, dying or allowing the timer to expire will end this ability and bring Phoenix back to this location with full health.", 0.0));

            abilitiesRepository.save(new Ability(null, 3L, "Slow Orb", "EQUIP a slowing orb. FIRE to throw a slowing orb forward that detonates upon landing, creating a lingering field that slows players caught inside of it.", 0.0));
            abilitiesRepository.save(new Ability(null, 3L, "Healing Orb", "EQUIP a healing orb. FIRE with your crosshairs over a damaged ally to activate a heal-over-time on them. ALT FIRE while Sage is damaged to activate a self heal-over-time. ", 0.0));
            abilitiesRepository.save(new Ability(null, 3L, "Barrier Orb", "EQUIP a barrier orb. FIRE places a solid wall. ALT FIRE rotates the targeter.", 0.0));
            abilitiesRepository.save(new Ability(null, 3L, "Resurrection", "EQUIP a resurrection ability. FIRE with your crosshairs placed over a dead ally to begin resurrecting them. After a brief channel, the ally will be brought back to life with full health.", 0.0));

            abilitiesRepository.save(new Ability(null, 4L, "Shock Bolt", "EQUIP a bow with a shock bolt. FIRE to send the explosive forward, detonating upon collision and damaging players nearby. HOLD FIRE to extend the range of the projectile. ALTERNATE FIRE to add up to two bounces to this arrow.", 0.0));
            abilitiesRepository.save(new Ability(null, 4L, "Recon Bolt", "EQUIP a bow with a recon bolt. FIRE to send the recon bolt forward, activating upon collision and revealing the location of nearby enemies caught in the line of sight of the bolt. HOLD FIRE to extend the range of the projectile. ALTERNATE FIRE to add up to two bounces to this arrow.", 0.0));
            abilitiesRepository.save(new Ability(null, 4L, "Owl Drone", "EQUIP an owl drone. FIRE to deploy and take control of movement of the drone. While in control of the drone, FIRE to shoot a marking dart. This dart will reveal the location of any player struck by the dart.", 0.0));
            abilitiesRepository.save(new Ability(null, 4L, "Hunters Fury", "EQUIP a bow with three long-range wall-piercing energy blasts. FIRE to release an energy blast in a line in front of Sova, dealing damage and revealing the location of enemies caught in the line. This ability can be RE-USED up to two more times while the ability timer is active.", 0.0));

            abilitiesRepository.save(new Ability(null, 5L, "Poison Cloud", "EQUIP a gas emitter. FIRE to throw the emitter that perpetually remains throughout the round. RE-USE the ability to create a toxic gas cloud at the cost of fuel. This ability can be RE-USED more than once and can be picked up to be REDEPLOYED.", 0.0));
            abilitiesRepository.save(new Ability(null, 5L, "Toxic Screen", "EQUIP a gas emitter launcher. FIRE to deploy a long line of gas emitters. RE-USE the ability to create a tall wall of toxic gas at the cost of fuel. This ability can be RE-USED more than once.", 0.0));
            abilitiesRepository.save(new Ability(null, 5L, "Snake Bite", "EQUIP a chemical launcher. FIRE to launch a canister that shatters upon hitting the floor, creating a lingering chemical zone that damages and slows enemies.", 0.0));
            abilitiesRepository.save(new Ability(null, 5L, "Viper's Pit", "EQUIP a chemical sprayer. FIRE to spray a chemical cloud in all directions around Viper, creating a large cloud that reduces the vision range and maximum health of players inside of it.", 0.0));

            abilitiesRepository.save(new Ability(null, 6L, "Cyber Cage", "INSTANTLY toss the cyber cage in front of Cypher. Activate to create a zone that blocks vision and slows enemies who pass through it.", 0.0));
            abilitiesRepository.save(new Ability(null, 6L, "Spycam", "EQUIP a spycam. FIRE to place the spycam at the targeted location. RE-USE this ability to take control of the camera’s view. While in control of the camera, FIRE to shoot a marking dart. This dart will reveal the location of any player struck by the dart.", 0.0));
            abilitiesRepository.save(new Ability(null, 6L, "Trapwire", "EQUIP a trapwire. FIRE to place a destructible and covert tripwire at the targeted location creating a line that spans between the placed location and the wall opposite. Enemy players who cross a tripwire will be tethered, revealed, and dazed after a short period if they do not destroy the device in time. This ability can be picked up to be REDEPLOYED.", 0.0));
            abilitiesRepository.save(new Ability(null, 6L, "Neural Theft", "INSTANTLY use on a dead enemy player in your crosshairs to reveal the location of all living enemy players.", 0.0));

            abilitiesRepository.save(new Ability(null, 7L, "Devour", "Enemies killed by Reyna leave behind Soul Orbs that last 3 seconds. INSTANTLY consume a nearby soul orb, rapidly healing for a short duration. Health gained through this skill exceeding 100 will decay over time. If EMPRESS is active, this skill will automatically cast and not consume the orb.", 0.0));
            abilitiesRepository.save(new Ability(null, 7L, "Dismiss", "INSTANTLY consume a nearby soul orb, becoming intangible for a short duration. If EMPRESS is active, also become invisible.", 0.0));
            abilitiesRepository.save(new Ability(null, 7L, "Leer", "EQUIP an ethereal destructible eye. ACTIVATE to cast the eye a short distance forward. The eye will Nearsight all enemies who look at it.", 0.0));
            abilitiesRepository.save(new Ability(null, 7L, "Empress", "INSTANTLY enter a frenzy, increasing firing speed, equip and reload speed dramatically. Scoring a kill renews the duration.", 0.0));

            abilitiesRepository.save(new Ability(null, 8L, "Alarmbot", "EQUIP a covert Alarmbot. FIRE to deploy a bot that hunts down enemies that get in range. After reaching its target, the bot explodes, applying Vulernable. HOLD EQUIP to recall a deployed bot.", 0.0));
            abilitiesRepository.save(new Ability(null, 8L, "Turret", "EQUIP a Turret. FIRE to deploy a turret that fires at enemies in a 180 degree cone. HOLD EQUIP to recall the deployed turret.", 0.0));
            abilitiesRepository.save(new Ability(null, 8L, "Nanoswarm", "EQUIP a Nanoswarm grenade. FIRE to throw the grenade. Upon landing, the Nanoswarm goes covert. ACTIVATE the Nanoswarm to deploy a damaging swarm of nanobots.", 0.0));
            abilitiesRepository.save(new Ability(null, 8L, "Lockdown", "EQUIP the Lockdown device. FIRE to deploy the device. After a long windup, the device Detains all enemies caught in the radius. The device can be destroyed by enemies.", 0.0));

            abilitiesRepository.save(new Ability(null, 9L, "Flashpoint", "EQUIP a blinding charge. FIRE the charge to set fast-acting burst through the wall. The charge detonates to blind all players looking at it.", 0.0));
            abilitiesRepository.save(new Ability(null, 9L, "Fault Line", "EQUIP a seismic blast. HOLD FIRE to increase the distance. RELEASE to set off the quake, dazing all players in its zone and in a line up to the zone.", 0.0));
            abilitiesRepository.save(new Ability(null, 9L, "Aftershock", "EQUIP a fusion charge. FIRE the charge to set a slow-acting burst through the wall. The burst does heavy damage to anyone caught in its area.", 0.0));
            abilitiesRepository.save(new Ability(null, 9L, "Rolling Thunder", "EQUIP a seismic charge. FIRE to send a cascading quake through all terrain in a large cone. The quake dazes and knocks up anyone caught in it.", 0.0));

            abilitiesRepository.save(new Ability(null, 10L, "Paranoia", "INSTANTLY fire a shadow projectile forward, briefly reducing the vision range of all players it touches. This projectile can pass straight through walls.", 0.0));
            abilitiesRepository.save(new Ability(null, 10L, "Dark Cover", "EQUIP a shadow orb and see its range indicator. FIRE to throw the shadow orb to the marked location, creating a long-lasting shadow sphere that blocks vision. HOLD ALTERNATE FIRE while targeting to move the marker further away. HOLD the ability key with targeting to move the marker closer.", 0.0));
            abilitiesRepository.save(new Ability(null, 10L, "Shrouded Step", "EQUIP a shadow walk ability and see its range indicator. FIRE to begin a brief channel, then teleport to the marked location.", 0.0));
            abilitiesRepository.save(new Ability(null, 10L, "From The Shadows", "EQUIP a tactical map. FIRE to begin teleporting to the selected location. While teleporting, Omen will appear as a Shade that can be destroyed by an enemy to cancel his teleport.", 0.0));

            abilitiesRepository.save(new Ability(null, 11L, "Updraft", "INSTANTLY propel Jett high into the air.", 0.0));
            abilitiesRepository.save(new Ability(null, 11L, "Tailwind", "INSTANTLY propel Jett in the direction she is moving. If Jett is standing still, she will propel forward.", 0.0));
            abilitiesRepository.save(new Ability(null, 11L, "Cloudburst", "INSTANTLY throw a projectile that expands into a brief vision-blocking cloud on impact with a surface. HOLD the ability key to curve the smoke in the direction of your crosshair.", 0.0));
            abilitiesRepository.save(new Ability(null, 11L, "Blade Storm", "EQUIP a set of highly accurate knives that recharge on killing an opponent. FIRE to throw a single knife at your target. ALTERNATE FIRE to throw all remaining daggers at your target.", 0.0));

            abilitiesRepository.save(new Ability(null, 12L, "Blast Pack", "INSTANTLY throw a Blast Pack that will stick to surfaces. RE-USE the ability after deployment to detonate, damaging and moving anything hit. Raze isn't damaged by this ability, but will still take fall damage if launched up far enough.", 0.0));
            abilitiesRepository.save(new Ability(null, 12L, "Paint Shells", "EQUIP a cluster grenade. FIRE to throw the grenade, which does damage and creates sub-munitions, each doing damage to anyone in their range.", 0.0));
            abilitiesRepository.save(new Ability(null, 12L, "Boom Bot", "EQUIP a Boom Bot. FIRE will deploy the bot, causing it to travel in a straight line on the ground, bouncing off walls. The Boom Bot will lock on to any enemies in its frontal cone and chase them, exploding for heavy damage if it reaches them.", 0.0));
            abilitiesRepository.save(new Ability(null, 12L, "Showstopper", "EQUIP a rocket launcher. FIRE shoots a rocket that does massive area damage on contact with anything.", 0.0));

            abilitiesRepository.save(new Ability(null, 13L, "Trailblazer", "EQUIP a Tasmanian tiger trinket. FIRE to send out and take control of the predator. While in control, FIRE to leap forward, exploding in a concussive blast and damaging directly hit enemies.", 0.0));
            abilitiesRepository.save(new Ability(null, 13L, "Guiding Light", "EQUIP a hawk trinket. FIRE to send it forward. HOLD FIRE to guide the hawk in the direction of your crosshair. RE-USE while the hawk is in flight to transform it into a flash that plays a hit confirm if an enemy was within range and line of sight.", 0.0));
            abilitiesRepository.save(new Ability(null, 13L, "Regrowth", "EQUIP a healing trinket. HOLD FIRE to channel, healing allies in range and line of sight. Can be reused until her healing pool is depleted. Skye cannot heal herself.", 0.0));
            abilitiesRepository.save(new Ability(null, 13L, "Seekers", "EQUIP a Seeker trinket. FIRE to send out three Seekers to track down the three closest enemies. If a Seeker reaches its target, it nearsights them.", 0.0));

            abilitiesRepository.save(new Ability(null, 14L, "Blindside", "EQUIP to rip an unstable dimensional fragment from reality. FIRE to throw the fragment, activating a flash that winds up once it collides with a hard surface in world.", 0.0));
            abilitiesRepository.save(new Ability(null, 14L, "Gatecrash", "EQUIP a rift tether FIRE to send the tether forward ALT FIRE to place a stationary tether ACTIVATE to teleport to the tether's location USE to trigger a fake teleport", 0.0));
            abilitiesRepository.save(new Ability(null, 14L, "Fakeout", "EQUIP an echo that transforms into a mirror image of Yoru when activated FIRE to instantly activate the mirror image and send it forward ALT FIRE to place an inactive echo USE to transform an inactive echo into a mirror image and send it forward. Mirror images explode in a blinding flash when destroyed by enemies.", 0.0));
            abilitiesRepository.save(new Ability(null, 14L, "Dimensional Drift", "EQUIP a mask that can see between dimensions. FIRE to drift into Yoru's dimension, unable to be affected or seen by enemies from the outside", 0.0));

            abilitiesRepository.save(new Ability(null, 15L, "Nove Pulse", "Place Stars in Astral Form (X) ACTIVATE a Star to detonate a Nova Pulse. The Nova Pulse charges briefly then strikes, concussing all players in its area.", 0.0));
            abilitiesRepository.save(new Ability(null, 15L, "Nebula", "Place Stars in Astral Form (X) ACTIVATE a Star to transform it into a Nebula (smoke). Use (F) on a Star to Dissipate it, returning the star to be placed in a new location after a delay. Dissipate briefly forms a fake Nebula at the Star’s location before returning.", 0.0));
            abilitiesRepository.save(new Ability(null, 15L, "Gravity Well", "Place Stars in Astral Form (X) ACTIVATE a Star to form a Gravity Well. Players in the area are pulled toward the center before it explodes, making all players still trapped inside fragile.", 0.0));
            abilitiesRepository.save(new Ability(null, 15L, "Astral Form Cosmic Divide", "ACTIVATE (X) to enter Astral Form where you can place Stars with PRIMARY FIRE. Stars can be reactivated later, transforming them into a Nova Pulse, Nebula, or Gravity Well. When Cosmic Divide is charged, use SECONDARY FIRE in Astral Form to begin aiming it, then PRIMARY FIRE to select two locations. An infinite Cosmic Divide connects the two points you select. Cosmic Divide blocks bullets and heavily dampens audio.", 0.0));

            abilitiesRepository.save(new Ability(null, 16L, "Flash Drive", "EQUIP a flash grenade. FIRE to throw. The flash grenade explodes after a short fuse, blinding anyone in line of sight.", 0.0));
            abilitiesRepository.save(new Ability(null, 16L, "Zero Point", "EQUIP a suppression blade. FIRE to throw. The blade sticks to the first surface it hits, winds up, and suppresses anyone in the radius of the explosion.", 0.0));
            abilitiesRepository.save(new Ability(null, 16L, "Fragment", "EQUIP an explosive fragment. FIRE to throw. The fragment sticks to the floor and explodes multiple times, dealing near lethal damage at the center with each explosion.", 0.0));
            abilitiesRepository.save(new Ability(null, 16L, "Null Cmd", "INSTANTLY overload with polarized radianite energy that empowers KAY/O and causes large energy pulses to emit from his location. Enemies hit with these pulses are suppressed for a short duration.", 0.0));

            abilitiesRepository.save(new Ability(null, 17L, "Headhunter", "ACTIVATE to equip a heavy pistol. ALT FIRE with the pistol equipped to aim down sights.", 0.0));
            abilitiesRepository.save(new Ability(null, 17L, "Rendezvous", "PLACE two teleport anchors. While on the ground and in range of an anchor, REACTIVATE to quickly teleport to the other anchor. Anchors can be picked up to be REDEPLOYED.", 0.0));
            abilitiesRepository.save(new Ability(null, 17L, "Trademark", "PLACE a trap that scans for enemies. When a visible enemy comes in range, the trap counts down and then destabilizes the terrain around them, creating a lingering field that slows players caught inside of it.", 0.0));
            abilitiesRepository.save(new Ability(null, 17L, "Tour De Force", "ACTIVATE to summon a powerful, custom sniper rifle that will kill an enemy with any direct hit. Killing an enemy creates a lingering field that slows players caught inside of it.", 0.0));

            abilitiesRepository.save(new Ability(null, 18L, "Relay Bolt", "INSTANTLY throw an energy bolt that bounces once. Upon hitting each surface, the bolt electrifies the ground below with a concussive blast.", 0.0));
            abilitiesRepository.save(new Ability(null, 18L, "High Gear", "INSTANTLY channel Neon’s power for increased speed. When charged, ALT FIRE to trigger an electric slide. Slide charge resets every two kills.", 0.0));
            abilitiesRepository.save(new Ability(null, 18L, "Fast Lane", "FIRE two energy lines forward on the ground that extend a short distance or until they hit a surface. The lines rise into walls of static electricity that block vision and damage enemies passing through them.", 0.0));
            abilitiesRepository.save(new Ability(null, 18L, "Overdrive", "Unleash Neon’s full power and speed for a short duration. FIRE to channel the power into a deadly lightning beam with high movement accuracy. The duration resets on each kill.", 0.0));

            abilitiesRepository.save(new Ability(null, 19L, "Seize", "Equip an orb of nightmare ink. FIRE to throw the orb which will plummet to the ground after a set amount of time. Upon hitting the ground, the ink will explode and create a zone in which enemies who are caught in it cannot escape the zone by normal means. RE-USE the ability to drop the projectile early in-flight", 0.0));
            abilitiesRepository.save(new Ability(null, 19L, "Haunt", "Equip a nightmarish entity. FIRE to throw the orb which will plummet to the ground after a set amount of time. Upon hitting the ground, the orb will turn into a nightmarish entity that will reveal the location of enemies caught in its line of sight. Enemies can destroy this entity. RE-USE the ability to drop the projectile early in-flight.", 0.0));
            abilitiesRepository.save(new Ability(null, 19L, "Prowler", "EQUIP a Prowler. FIRE will send the Prowler out, causing it to travel in a straight line. The Prowler will lock onto any enemies or trails in their frontal vision cone and chase them, nearsighting them if it reaches them. HOLD the FIRE button to steer the Prowler in the direction of your crosshair.", 0.0));
            abilitiesRepository.save(new Ability(null, 19L, "Nightfall", "EQUIP the power of Fear. FIRE to send out a wave of nightmare energy that can traverse through walls. The energy creates a trail to the opponent as well as deafens and decays them.", 0.0));
        };
    }
}
