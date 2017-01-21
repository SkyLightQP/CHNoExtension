package com.combbm.chnoextension;

import com.laytonsmith.PureUtilities.SimpleVersion;
import com.laytonsmith.PureUtilities.Version;
import com.laytonsmith.abstraction.bukkit.entities.BukkitMCPlayer;
import com.laytonsmith.annotations.api;
import com.laytonsmith.core.Static;
import com.laytonsmith.core.constructs.CVoid;
import com.laytonsmith.core.constructs.Construct;
import com.laytonsmith.core.constructs.Target;
import com.laytonsmith.core.exceptions.CRE.CREThrowable;
import com.laytonsmith.core.exceptions.CancelCommandException;
import com.laytonsmith.core.exceptions.ConfigRuntimeException;
import com.laytonsmith.core.functions.AbstractFunction;
import net.minecraft.server.v1_10_R1.PacketPlayOutAnimation;
import net.minecraft.server.v1_10_R1.PacketPlayOutGameStateChange;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_10_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

/**
 * Created by SkyLightQP on 2017-01-21.
 */
public class Functions {
    @api
    public static class swing_arm extends AbstractFunction {

        public Class<? extends CREThrowable>[] thrown() {
            return new Class[0];
        }

        public boolean isRestricted() {
            return false;
        }

        public Boolean runAsync() {
            return null;
        }

        @Override
        public Construct exec(Target t, com.laytonsmith.core.environments.Environment env, Construct... args) throws CancelCommandException, ConfigRuntimeException {
            if (args.length <= 0) {
                BukkitMCPlayer player = (BukkitMCPlayer)Static.getPlayer(env, t);
                Player p = player._Player();
                CraftPlayer c = (CraftPlayer) p;
                PacketPlayOutAnimation packet = new PacketPlayOutAnimation(c.getHandle(), 0);
                c.getHandle().playerConnection.sendPacket(packet);
            } else {
                Player p = (Player) Bukkit.getPlayerExact(args[0].val());
                CraftPlayer c = (CraftPlayer) p;
                PacketPlayOutAnimation packet = new PacketPlayOutAnimation(c.getHandle(), 0);
                c.getHandle().playerConnection.sendPacket(packet);
            }
            return CVoid.VOID;
        }

        public String getName() {
            return "swing_arm";
        }

        public Integer[] numArgs() {
            return new Integer[]{0, 1};
        }

        public String docs() {
            return "void swing_arm";
        }

        public Version since() {
            return new SimpleVersion(1, 0, 0);
        }
    }

    @api
    public static class take_damage extends AbstractFunction {

        public Class<? extends CREThrowable>[] thrown() {
            return new Class[0];
        }

        public boolean isRestricted() {
            return false;
        }

        public Boolean runAsync() {
            return null;
        }

        @Override
        public Construct exec(Target t, com.laytonsmith.core.environments.Environment env, Construct... args) throws CancelCommandException, ConfigRuntimeException {
            if (args.length <= 0) {
                BukkitMCPlayer player = (BukkitMCPlayer)Static.getPlayer(env, t);
                Player p = player._Player();
                CraftPlayer c = (CraftPlayer) p;
                PacketPlayOutAnimation packet = new PacketPlayOutAnimation(c.getHandle(), 1);
                c.getHandle().playerConnection.sendPacket(packet);
            } else {
                Player p = Bukkit.getPlayerExact(args[0].val());
                CraftPlayer c = (CraftPlayer) p;
                PacketPlayOutAnimation packet = new PacketPlayOutAnimation(c.getHandle(), 1);
                c.getHandle().playerConnection.sendPacket(packet);
            }
            return CVoid.VOID;
        }

        public String getName() {
            return "take_damage";
        }

        public Integer[] numArgs() {
            return new Integer[]{0, 1};
        }

        public String docs() {
            return "void take_damage";
        }

        public Version since() {
            return new SimpleVersion(1, 0, 0);
        }
    }

    @api
    public static class show_critical_effect extends AbstractFunction {

        public Class<? extends CREThrowable>[] thrown() {
            return new Class[0];
        }

        public boolean isRestricted() {
            return false;
        }

        public Boolean runAsync() {
            return null;
        }

        @Override
        public Construct exec(Target t, com.laytonsmith.core.environments.Environment env, Construct... args) throws CancelCommandException, ConfigRuntimeException {
            if (args.length <= 0) {
                BukkitMCPlayer player = (BukkitMCPlayer)Static.getPlayer(env, t);
                Player p = player._Player();
                CraftPlayer c = (CraftPlayer) p;
                PacketPlayOutAnimation packet = new PacketPlayOutAnimation(c.getHandle(), 4);
                c.getHandle().playerConnection.sendPacket(packet);
            } else {
                Player p = Bukkit.getPlayerExact(args[0].val());
                CraftPlayer c = (CraftPlayer) p;
                PacketPlayOutAnimation packet = new PacketPlayOutAnimation(c.getHandle(), 4);
                c.getHandle().playerConnection.sendPacket(packet);
            }
            return CVoid.VOID;
        }

        public String getName() {
            return "show_critical_effect";
        }

        public Integer[] numArgs() {
            return new Integer[]{0, 1};
        }

        public String docs() {
            return "void show_critical_effect";
        }

        public Version since() {
            return new SimpleVersion(1, 0, 0);
        }
    }

    @api
    public static class show_magiccritical_effect extends AbstractFunction {

        public Class<? extends CREThrowable>[] thrown() {
            return new Class[0];
        }

        public boolean isRestricted() {
            return false;
        }

        public Boolean runAsync() {
            return null;
        }

        @Override
        public Construct exec(Target t, com.laytonsmith.core.environments.Environment env, Construct... args) throws CancelCommandException, ConfigRuntimeException {
            if (args.length <= 0) {
                BukkitMCPlayer player = (BukkitMCPlayer)Static.getPlayer(env, t);
                Player p = player._Player();
                CraftPlayer c = (CraftPlayer) p;
                PacketPlayOutAnimation packet = new PacketPlayOutAnimation(c.getHandle(), 5);
                c.getHandle().playerConnection.sendPacket(packet);
            } else {
                Player p = Bukkit.getPlayerExact(args[0].val());
                CraftPlayer c = (CraftPlayer) p;
                PacketPlayOutAnimation packet = new PacketPlayOutAnimation(c.getHandle(), 5);
                c.getHandle().playerConnection.sendPacket(packet);
            }
            return CVoid.VOID;
        }

        public String getName() {
            return "show_magiccritical_effect";
        }

        public Integer[] numArgs() {
            return new Integer[]{0, 1};
        }

        public String docs() {
            return "void show_magiccritical_effect";
        }

        public Version since() {
            return new SimpleVersion(1, 0, 0);
        }
    }

    @api
    public static class play_guardian_effect extends AbstractFunction {

        public Class<? extends CREThrowable>[] thrown() {
            return new Class[0];
        }

        public boolean isRestricted() {
            return false;
        }

        public Boolean runAsync() {
            return null;
        }

        @Override
        public Construct exec(Target t, com.laytonsmith.core.environments.Environment env, Construct... args) throws CancelCommandException, ConfigRuntimeException {
            BukkitMCPlayer player = (BukkitMCPlayer)Static.getPlayer(env, t);
            Player p = player._Player();
            CraftPlayer c = (CraftPlayer) p;
            PacketPlayOutGameStateChange packet = new PacketPlayOutGameStateChange(10,0);
            c.getHandle().playerConnection.sendPacket(packet);
            return CVoid.VOID;
        }

        public String getName() {
            return "play_guardian_effect";
        }

        public Integer[] numArgs() {
            return new Integer[]{0};
        }

        public String docs() {
            return "void play_guardian_effect";
        }

        public Version since() {
            return new SimpleVersion(1, 0, 0);
        }
    }
    @api
    public static class set_fadevalue extends AbstractFunction {

        public Class<? extends CREThrowable>[] thrown() {
            return new Class[0];
        }

        public boolean isRestricted() {
            return false;
        }

        public Boolean runAsync() {
            return null;
        }

        @Override
        public Construct exec(Target t, com.laytonsmith.core.environments.Environment env, Construct... args) throws CancelCommandException, ConfigRuntimeException {
            BukkitMCPlayer player = (BukkitMCPlayer)Static.getPlayer(env, t);
            Player p = player._Player();
            CraftPlayer c = (CraftPlayer) p;
            PacketPlayOutGameStateChange packet = new PacketPlayOutGameStateChange(7, Integer.parseInt(args[0].val()));
            c.getHandle().playerConnection.sendPacket(packet);
            return CVoid.VOID;
        }

        public String getName() {
            return "set_fadevalue";
        }

        public Integer[] numArgs() {
            return new Integer[]{1};
        }

        public String docs() {
            return "void set_fadevalue";
        }

        public Version since() {
            return new SimpleVersion(1, 0, 0);
        }
    }
}
