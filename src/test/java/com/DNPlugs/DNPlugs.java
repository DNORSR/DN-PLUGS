package com.DNPlugs;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class DNPlugs
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin();
		RuneLite.main(args);
	}
}