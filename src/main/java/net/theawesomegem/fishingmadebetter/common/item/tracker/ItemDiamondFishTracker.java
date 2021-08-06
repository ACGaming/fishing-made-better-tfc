package net.theawesomegem.fishingmadebetter.common.item.tracker;

import net.theawesomegem.fishingmadebetter.common.data.FishData.FishingLiquid;

public class ItemDiamondFishTracker extends ItemFishTracker {
    public ItemDiamondFishTracker() {
        super(TrackingVision.BEST, FishingLiquid.SALT_WATER, 150, "fish_tracker_diamond");
    }
}