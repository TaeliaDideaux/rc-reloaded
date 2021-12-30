package com.TaeliaDideaux.rcreloaded.boltcurrency;

import com.TaeliaDideaux.rcreloaded.core.init.CurrencyPacket;
import com.TaeliaDideaux.rcreloaded.core.init.NetworkInit;

import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.fmllegacy.network.PacketDistributor;

public class PlayerCurrencyStorage extends CurrencyStorage {
	
	private final ServerPlayer player;
	
	public PlayerCurrencyStorage(ServerPlayer player) {
		this.player = player;
	}
	
	@Override
	public void setBolts(int value) {
		super.setBolts(value);
		
		if(player.connection != null) {
			player.getCapability(CurrencyCapability.CURRENCY_CAPABILITY).ifPresent(capability -> NetworkInit.CHANNEL.send(
				PacketDistributor.PLAYER.with(()-> this.player), new CurrencyPacket(capability)
			));
		}
	}

	@Override
	public void addBolts(int value) {
		this.setBolts(this.getBolts() + value);
	}

	@Override
	public void useBolts(int value) {
		this.setBolts(this.getBolts() - value);
	}
}