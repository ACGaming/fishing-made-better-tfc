package net.theawesomegem.fishingmadebetter.common.item.tracker;

import net.theawesomegem.fishingmadebetter.common.data.FishData.FishingLiquid;

public class ItemGoldFishTracker extends ItemFishTracker {
    public ItemGoldFishTracker() {
        super(TrackingVision.NORMAL, FishingLiquid.SALT_WATER, 100, "fish_tracker_gold");
    }
}