package com.TaeliaDideaux.rcreloaded.common;

import java.util.Collection;

import com.TaeliaDideaux.rcreloaded.RatchetAndClankReloadedMod;
import com.TaeliaDideaux.rcreloaded.boltcurrency.CurrencyCapability;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

public class RCCommands {
	
    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
    	// Adding bolts to one's account
        dispatcher.register(Commands.literal("ratchet")
        		.then(Commands.argument("targets", EntityArgument.players())
	                .then(Commands.literal("addBolts")
	                        .then(Commands.argument("amount", IntegerArgumentType.integer())
	                        		.executes(RCCommands::addBolts)
	                        )
	                )
	          )
        );
       
    }

    private static int addBolts(CommandContext<CommandSourceStack> context) throws CommandSyntaxException {
        int amount = IntegerArgumentType.getInteger(context, "amount");
        Collection<ServerPlayer> targets = EntityArgument.getPlayers(context, "targets");
        
        targets.stream().flatMap(entry -> entry
        		.getCapability(CurrencyCapability.CURRENCY_CAPABILITY)
        		.resolve()
        		.stream())
        	.forEach(cap -> cap.addBolts(amount));
        
        return 0;
    }
    
    

    @Mod.EventBusSubscriber(modid = RatchetAndClankReloadedMod.MODID, bus = Bus.FORGE)
    public static class ForgeBusSubscriber {
    	
        @SubscribeEvent
        public static void commandLoading(RegisterCommandsEvent event) {
        	CommandDispatcher<CommandSourceStack> dispatcher = event.getDispatcher();
        	RCCommands.register(dispatcher);
        }
    	
    }
    
}