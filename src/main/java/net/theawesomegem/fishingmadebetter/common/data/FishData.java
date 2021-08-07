package net.theawesomegem.fishingmadebetter.common.data;

import com.google.gson.annotations.SerializedName;

import java.util.*;

public class FishData {
    public enum TimeToFish {
        @SerializedName("day")      DAY,
        @SerializedName("night")    NIGHT,
        @SerializedName("any")      ANY
    }

    public enum FishingLiquid {
        @SerializedName("fresh_water") 	FRESH_WATER,
        @SerializedName("salt_water") 	SALT_WATER,
        @SerializedName("lava")		LAVA,
        @SerializedName("void")		VOID,
        @SerializedName("any")		ANY
    }

    public enum BaitEnum {
        @SerializedName("fruit") FRUIT,
        @SerializedName("grain") GRAIN,
        @SerializedName("vegetable") VEGETABLE,
        @SerializedName("meatNormal") MEAT_NORMAL,
        @SerializedName("meatExtra") MEAT_EXTRA,
        @SerializedName("smallPredatorAQC") SMALL_PREDATOR_AQC,
        @SerializedName("largePredatorAQC") LARGE_PREDATOR_AQC,
        @SerializedName("oceanPredatorAQC") OCEAN_PREDATOR_AQC,
        @SerializedName("herbivoreAQC") HERBIVORE_AQC;

        Map<String, Integer[]> fruit = new HashMap<String, Integer[]>(){{
            put("firmalife:melon", new Integer[] {0});
            put("tfc:food/banana", new Integer[] {0});
            put("tfc:food/blackberry", new Integer[] {0});
            put("tfc:food/blueberry", new Integer[] {0});
            put("tfc:food/bunch_berry", new Integer[] {0});
            put("tfc:food/cherry", new Integer[] {0});
            put("tfc:food/cloud_berry", new Integer[] {0});
            put("tfc:food/cranberry", new Integer[] {0});
            put("tfc:food/elderberry", new Integer[] {0});
            put("tfc:food/gooseberry", new Integer[] {0});
            put("tfc:food/green_apple", new Integer[] {0});
            put("tfc:food/lemon", new Integer[] {0});
            put("tfc:food/orange", new Integer[] {0});
            put("tfc:food/peach", new Integer[] {0});
            put("tfc:food/plum", new Integer[] {0});
            put("tfc:food/raspberry", new Integer[] {0});
            put("tfc:food/red_apple", new Integer[] {0});
            put("tfc:food/snow_berry", new Integer[] {0});
            put("tfc:food/strawberry", new Integer[] {0});
            put("tfc:food/wintergreen_berry", new Integer[] {0});
        }};

        Map<String, Integer[]> grain = new HashMap<String, Integer[]>(){{
            put("firmalife:crop/seeds/melon", new Integer[] {0});
            put("firmalife:crop/seeds/pumpkin", new Integer[] {0});
            put("tfc:crop/seeds/barley", new Integer[] {0});
            put("tfc:crop/seeds/beet", new Integer[] {0});
            put("tfc:crop/seeds/cabbage", new Integer[] {0});
            put("tfc:crop/seeds/carrot", new Integer[] {0});
            put("tfc:crop/seeds/garlic", new Integer[] {0});
            put("tfc:crop/seeds/green_bean", new Integer[] {0});
            put("tfc:crop/seeds/jute", new Integer[] {0});
            put("tfc:crop/seeds/maize", new Integer[] {0});
            put("tfc:crop/seeds/oat", new Integer[] {0});
            put("tfc:crop/seeds/onion", new Integer[] {0});
            put("tfc:crop/seeds/potato", new Integer[] {0});
            put("tfc:crop/seeds/red_bell_pepper", new Integer[] {0});
            put("tfc:crop/seeds/rice", new Integer[] {0});
            put("tfc:crop/seeds/rye", new Integer[] {0});
            put("tfc:crop/seeds/soybean", new Integer[] {0});
            put("tfc:crop/seeds/squash", new Integer[] {0});
            put("tfc:crop/seeds/sugarcane", new Integer[] {0});
            put("tfc:crop/seeds/tomato", new Integer[] {0});
            put("tfc:crop/seeds/wheat", new Integer[] {0});
            put("tfc:crop/seeds/yellow_bell_pepper", new Integer[] {0});
        }};

        Map<String, Integer[]> vegetable = new HashMap<String, Integer[]>(){{
            put("tfc:food/beet", new Integer[] {0});
            put("tfc:food/cabbage", new Integer[] {0});
            put("tfc:food/carrot", new Integer[] {0});
            put("tfc:food/garlic", new Integer[] {0});
            put("tfc:food/green_bean", new Integer[] {0});
            put("tfc:food/green_bell_pepper", new Integer[] {0});
            put("tfc:food/maize", new Integer[] {0});
            put("tfc:food/onion", new Integer[] {0});
            put("tfc:food/red_bell_pepper", new Integer[] {0});
            put("tfc:food/soybean", new Integer[] {0});
            put("tfc:food/squash", new Integer[] {0});
            put("tfc:food/tomato", new Integer[] {0});
            put("tfc:food/yellow_bell_pepper", new Integer[] {0});
        }};

        Map<String, Integer[]> meatNormal = new HashMap<String, Integer[]>(){{
            put("minecraft:rotten_flesh", new Integer[] {0});
            put("minecraft:spider_eye", new Integer[] {0});
            put("tfc:food/fish", new Integer[] {2});
        }};

        Map<String, Integer[]> meatExtra = new HashMap<String, Integer[]>(){{
            put("tfc:food/bear", new Integer[] {0});
            put("tfc:food/beef", new Integer[] {0});
            put("tfc:food/calamari", new Integer[] {0});
            put("tfc:food/camelidae", new Integer[] {0});
            put("tfc:food/chicken", new Integer[] {0});
            put("tfc:food/gran_feline", new Integer[] {0});
            put("tfc:food/horse_meat", new Integer[] {0});
            put("tfc:food/mongoose", new Integer[] {0});
            put("tfc:food/mutton", new Integer[] {0});
            put("tfc:food/pheasant", new Integer[] {0});
            put("tfc:food/pork", new Integer[] {0});
            put("tfc:food/rabbit", new Integer[] {0});
            put("tfc:food/venison", new Integer[] {0});
            put("tfc:food/wolf", new Integer[] {0});
        }};

        Map<String, Integer[]> small_predator_aqc = new HashMap<String, Integer[]>(){{
            put("aquaculture:fish", new Integer[] {19, 37});
        }};

        Map<String, Integer[]> large_predator_aqc = new HashMap<String, Integer[]>(){{
            put("aquaculture:fish", new Integer[] {0, 1, 17});
        }};

        Map<String, Integer[]> ocean_predator_aqc = new HashMap<String, Integer[]>(){{
            put("aquaculture:fish", new Integer[] {9, 10, 15, 16, 26});
        }};

        Map<String, Integer[]> herbivore_aqc = new HashMap<String, Integer[]>(){{
            put("aquaculture:food", new Integer[] {0, 1});
        }};

        public Map<String, Integer[]> getValues(BaitEnum value) {
            switch(value) {
                case FRUIT : return fruit;
                case GRAIN : return grain;
                case VEGETABLE : return vegetable;
                case MEAT_NORMAL : return meatNormal;
                case MEAT_EXTRA : return meatExtra;
                case SMALL_PREDATOR_AQC : return small_predator_aqc;
                case LARGE_PREDATOR_AQC : return large_predator_aqc;
                case OCEAN_PREDATOR_AQC : return ocean_predator_aqc;
                case HERBIVORE_AQC : return herbivore_aqc;
                default : return vegetable;
            }
        }
    }

    public String fishId;
    public String itemId;
    public int itemMetaData;
    public String description;
    public int minFishTime;
    public int maxFishTime;
    public int minErrorVariance;
    public int maxErrorVariance;
    public int minWeight;
    public int maxWeight;
    public TimeToFish time;
    public FishingLiquid liquid;
    public boolean rainRequired;
    public boolean thunderRequired;
    public int rarity;
    public int minDeepLevel;
    public int maxDeepLevel;
    public int minYLevel;
    public int maxYLevel;
    public int maxLightLevel;
    public int reproductionTime;
    public int eatingFrequency;
    public boolean trackable;
    public boolean biomeBlacklist;
    public boolean dimensionBlacklist;
    public List<String> biomeTagList = new ArrayList<>();
    public List<Integer> dimensionList = new ArrayList<>();
    public int timeOutsideOfWater;
    public boolean allowScaling;
    public String scalingItem;
    public int scalingItemMetadata;
    public boolean scalingUseWeight;
    public boolean allowFillet;
    public boolean defaultFillet;
    public String filletItem;
    public int filletItemMetadata;
    public boolean filletUseWeight;
    public Map<String, Integer[]> baitItemMap = new HashMap<>();

    public static FishData createData(String fishId
        , String itemId
        , int itemMetaData
        , String description
        , int minFishTime
        , int maxFishTime
        , int minErrorVariance
        , int maxErrorVariance
        , int minWeight
        , int maxWeight
        , TimeToFish time
        , FishingLiquid liquid
        , boolean rainRequired
        , boolean thunderRequired
        , int rarity
        , int minDeepLevel
        , int maxDeepLevel
        , int minYLevel
        , int maxYLevel
        , int maxLightLevel
        , int reproductionTime
        , int eatingFrequency
        , boolean trackable
        , boolean biomeBlacklist
        , boolean dimensionBlacklist
        , String[] biomeTagList
        , int[] dimensionList
        , int timeOutsideOfWater
        , boolean allowScaling
        , String scalingItem
        , int scalingItemMetadata
        , boolean scalingUseWeight
        , boolean allowFillet
        , boolean defaultFillet
        , String filletItem
        , int filletItemMetadata
        , boolean filletUseWeight
        , BaitEnum[] baitEnumArray) {
        FishData fishData = new FishData();

        fishData.fishId = fishId;
        fishData.itemId = itemId;
        fishData.itemMetaData = itemMetaData;
        fishData.description = description;
        fishData.minFishTime = minFishTime;
        fishData.maxFishTime = maxFishTime;
        fishData.minErrorVariance = minErrorVariance;
        fishData.maxErrorVariance = maxErrorVariance;
        fishData.minWeight = minWeight;
        fishData.maxWeight = maxWeight;
        fishData.time = time;
        fishData.liquid = liquid;
        fishData.rainRequired = rainRequired;
        fishData.thunderRequired = thunderRequired;
        fishData.rarity = rarity;
        fishData.minDeepLevel = minDeepLevel;
        fishData.maxDeepLevel = maxDeepLevel;
        fishData.minYLevel = minYLevel;
        fishData.maxYLevel = maxYLevel;
        fishData.maxLightLevel = maxLightLevel;
        fishData.reproductionTime = reproductionTime;
        fishData.eatingFrequency = eatingFrequency;
        fishData.trackable = trackable;
        fishData.biomeBlacklist = biomeBlacklist;
        fishData.dimensionBlacklist = dimensionBlacklist;
        fishData.biomeTagList = new ArrayList<>();
        fishData.biomeTagList.addAll(Arrays.asList(biomeTagList));
        fishData.dimensionList = new ArrayList<>();
        for (int dim : dimensionList) fishData.dimensionList.add(dim);
        fishData.timeOutsideOfWater = timeOutsideOfWater;
        fishData.allowScaling = allowScaling;
        fishData.scalingItem = scalingItem;
        fishData.scalingItemMetadata = scalingItemMetadata;
        fishData.scalingUseWeight = scalingUseWeight;
        fishData.allowFillet = allowFillet;
        fishData.defaultFillet = defaultFillet;
        fishData.filletItem = filletItem;
        fishData.filletItemMetadata = filletItemMetadata;
        fishData.filletUseWeight = filletUseWeight;
        for (BaitEnum entry : baitEnumArray) fishData.baitItemMap.putAll(entry.getValues(entry));

        return fishData;
    }
}