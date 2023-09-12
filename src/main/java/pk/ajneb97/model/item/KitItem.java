package pk.ajneb97.model.item;

import java.util.List;

public class KitItem {

    private String id;
    private int amount;
    private String name;
    private List<String> lore;
    private short durability;
    private int customModelData;
    private List<String> enchants;
    private List<String> flags;
    private List<String> bookEnchants;
    private int color;
    private List<String> nbt;
    //Format:
    //<name>;<operation>;<amount>;<uuid>;<slot>
    private List<String> attributes;

    private KitItemSkullData skullData;
    private KitItemPotionData potionData;
    private KitItemFireworkData fireworkData;
    private KitItemBannerData bannerData;
    private KitItemBookData bookData;
    private KitItemTrimData trimData;

    private boolean offhand;
    private int previewSlot;

    public KitItem(String id) {
        this.id = id;
        this.amount = 1;
        this.durability = 0;
        this.customModelData = 0;
        this.color = 0;
        this.previewSlot = -1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getLore() {
        return lore;
    }

    public void setLore(List<String> lore) {
        this.lore = lore;
    }

    public short getDurability() {
        return durability;
    }

    public void setDurability(short durability) {
        this.durability = durability;
    }

    public int getCustomModelData() {
        return customModelData;
    }

    public void setCustomModelData(int customModelData) {
        this.customModelData = customModelData;
    }

    public List<String> getEnchants() {
        return enchants;
    }

    public void setEnchants(List<String> enchants) {
        this.enchants = enchants;
    }

    public List<String> getFlags() {
        return flags;
    }

    public void setFlags(List<String> flags) {
        this.flags = flags;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public KitItemSkullData getSkullData() {
        return skullData;
    }

    public void setSkullData(KitItemSkullData skullData) {
        this.skullData = skullData;
    }

    public KitItemPotionData getPotionData() {
        return potionData;
    }

    public void setPotionData(KitItemPotionData potionData) {
        this.potionData = potionData;
    }

    public List<String> getBookEnchants() {
        return bookEnchants;
    }

    public void setBookEnchants(List<String> bookEnchants) {
        this.bookEnchants = bookEnchants;
    }

    public List<String> getNbt() {
        return nbt;
    }

    public void setNbt(List<String> nbt) {
        this.nbt = nbt;
    }

    public List<String> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<String> attributes) {
        this.attributes = attributes;
    }

    public KitItemFireworkData getFireworkData() {
        return fireworkData;
    }

    public void setFireworkData(KitItemFireworkData fireworkData) {
        this.fireworkData = fireworkData;
    }

    public KitItemBannerData getBannerData() {
        return bannerData;
    }

    public void setBannerData(KitItemBannerData bannerData) {
        this.bannerData = bannerData;
    }

    public KitItemBookData getBookData() {
        return bookData;
    }

    public void setBookData(KitItemBookData bookData) {
        this.bookData = bookData;
    }

    public KitItemTrimData getTrimData() {
        return trimData;
    }

    public void setTrimData(KitItemTrimData trimData) {
        this.trimData = trimData;
    }

    public boolean isOffhand() {
        return offhand;
    }

    public void setOffhand(boolean offhand) {
        this.offhand = offhand;
    }

    public int getPreviewSlot() {
        return previewSlot;
    }

    public void setPreviewSlot(int previewSlot) {
        this.previewSlot = previewSlot;
    }

    public void removeOffHandFromEditInventory(){
        //Assumes that has the lore and the nbt
        lore.remove(lore.size()-1);
        lore.remove(lore.size()-1);
        for(int i=0;i<nbt.size();i++){
            if(nbt.get(i).startsWith("playerkits_offhand")){
                nbt.remove(i);
                return;
            }
        }
    }
}
