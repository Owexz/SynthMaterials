/*
 *  Copyright 2012 Owexz.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package net.owexz.synthmaterials;
 
import java.util.logging.Logger;



import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.*;
import org.getspout.spoutapi.material.CustomBlock;
import org.getspout.spoutapi.material.MaterialData;
 
 
public class SynthMaterials extends JavaPlugin
{
 
    public SynthMaterials()
    {
        log = Logger.getLogger("Minecraft");
        compressedcoalBlockTexture = new Texture(this, "http://www.owexz.net/uploads/1/4/8/5/1485487/578122832.png", 64, 16, 16);
    }
 
    public void onEnable()
    {
    	compressedcoalBlock = new CompressedCoalBlock(this);
        SpoutShapedRecipe recipe = new SpoutShapedRecipe(new SpoutItemStack(compressedcoalBlock, 1));
        recipe.shape("AAA", "ABA", "AAA");
        recipe.setIngredient('A', MaterialData.coal);
        recipe.setIngredient('B', MaterialData.obsidian);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
        SpoutShapedRecipe recipe1 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.diamond, 1));
        recipe1.shape("AAA", "ABA", "AAA");
        recipe1.setIngredient('A', MaterialData.coal);
        recipe1.setIngredient('B', compressedcoalBlock);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe1);
        SpoutShapedRecipe recipe2 = new SpoutShapedRecipe(new SpoutItemStack(compressedcoalBlock, 1));
        recipe2.shape("AAA", "ABA", "AAA");
        recipe2.setIngredient('A', MaterialData.charcoal);
        recipe2.setIngredient('B', MaterialData.obsidian);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe2);
        SpoutShapedRecipe recipe3 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.diamond, 1));
        recipe3.shape("AAA", "ABA", "AAA");
        recipe3.setIngredient('A', MaterialData.charcoal);
        recipe3.setIngredient('B', compressedcoalBlock);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe3);
        SpoutShapedRecipe recipe4= new SpoutShapedRecipe(new SpoutItemStack(MaterialData.blazeRod, 1));
        recipe4.shape("AAB", "ABA", "BAA");
        recipe4.setIngredient('A', MaterialData.redstone);
        recipe4.setIngredient('B', MaterialData.goldIngot);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe4);
        SpoutShapedRecipe recipe5 = new SpoutShapedRecipe(new SpoutItemStack(MaterialData.slimeball, 1));
        recipe5.shape(" C ", "BAB", "   ");
        recipe5.setIngredient('A', MaterialData.milk);
        recipe5.setIngredient('B', MaterialData.limeDye);
        recipe5.setIngredient('C', MaterialData.fermentedSpiderEye);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe5);
        SpoutShapedRecipe recipe6= new SpoutShapedRecipe(new SpoutItemStack(MaterialData.ghastTear, 1));
        recipe6.shape("AAA", "ABA", "AAA");
        recipe6.setIngredient('A', MaterialData.ironIngot);
        recipe6.setIngredient('B', MaterialData.goldNugget);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe6);
        SpoutShapelessRecipe recipe7= new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.netherWart, 1));
        recipe7.addIngredient(MaterialData.rottenFlesh);
        recipe7.addIngredient(MaterialData.redMushroom);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe7);
        SpoutShapedRecipe recipe8= new SpoutShapedRecipe(new SpoutItemStack(MaterialData.gunpowder, 1));
        recipe8.shape(" A ", "AAA", " A ");
        recipe8.setIngredient('A', MaterialData.soulSand);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe8);
        SpoutShapedRecipe recipe9= new SpoutShapedRecipe(new SpoutItemStack(MaterialData.gunpowder, 1));
        recipe9.shape("AAA", "ABA", "AAA");
        recipe9.setIngredient('A', MaterialData.lapisLazuli);
        recipe9.setIngredient('B', MaterialData.glassBottle);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe9);
        SpoutShapedRecipe recipe10= new SpoutShapedRecipe(new SpoutItemStack(MaterialData.enderPearl, 1));
        recipe10.shape("AAA", "ABA", "AAA");
        recipe10.setIngredient('A', MaterialData.lapisLazuli);
        recipe10.setIngredient('B', MaterialData.glassBottle);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe10);
        ShapedRecipe recipe11 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)50));
        recipe11.shape("AAA", "ABA", "AAA");
        recipe11.setIngredient('A', Material.SULPHUR);
        recipe11.setIngredient('B', Material.EGG);
        Bukkit.getServer().addRecipe(recipe11);
        ShapedRecipe recipe12 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)51));
        recipe12.shape("AAA", "ABA", "AAA");
        recipe12.setIngredient('A', Material.BONE);
        recipe12.setIngredient('B', Material.EGG);
        Bukkit.getServer().addRecipe(recipe12);
        ShapedRecipe recipe13 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)52));
        recipe13.shape("ACA", "CBC", "ACA");
        recipe13.setIngredient('A', Material.STRING);
        recipe13.setIngredient('B', Material.EGG);
        recipe13.setIngredient('C', Material.SPIDER_EYE);
        Bukkit.getServer().addRecipe(recipe13);
        ShapedRecipe recipe14 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)53));
        recipe14.shape("ACA", "CBC", "ACA");
        recipe14.setIngredient('A', Material.ROTTEN_FLESH);
        recipe14.setIngredient('B', Material.EGG);
        recipe14.setIngredient('C', Material.GOLD_INGOT);
        Bukkit.getServer().addRecipe(recipe14);
        ShapedRecipe recipe15 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)54));
        recipe15.shape("AAA", "ABA", "AAA");
        recipe15.setIngredient('A', Material.ROTTEN_FLESH);
        recipe15.setIngredient('B', Material.EGG);
        Bukkit.getServer().addRecipe(recipe15);
        ShapedRecipe recipe16 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)55));
        recipe16.shape("AAA", "ABA", "AAA");
        recipe16.setIngredient('A', Material.SLIME_BALL);
        recipe16.setIngredient('B', Material.EGG);
        Bukkit.getServer().addRecipe(recipe16);
        ShapedRecipe recipe17 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)56));
        recipe17.shape("AAA", "ABA", "AAA");
        recipe17.setIngredient('A', Material.GHAST_TEAR);
        recipe17.setIngredient('B', Material.EGG);
        Bukkit.getServer().addRecipe(recipe17);
        ShapedRecipe recipe18 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)57));
        recipe18.shape("ACA", "CBC", "ACA");
        recipe18.setIngredient('A', Material.ROTTEN_FLESH);
        recipe18.setIngredient('B', Material.EGG);
        recipe18.setIngredient('C', Material.PORK);
        Bukkit.getServer().addRecipe(recipe18);
        ShapedRecipe recipe19 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)58));
        recipe19.shape("AAA", "ABA", "AAA");
        recipe19.setIngredient('A', Material.ENDER_PEARL);
        recipe19.setIngredient('B', Material.EGG);
        Bukkit.getServer().addRecipe(recipe19);
        ShapedRecipe recipe20 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)59));
        recipe20.shape("ACA", "CBC", "ACA");
        recipe20.setIngredient('A', Material.SPIDER_EYE);
        recipe20.setIngredient('B', Material.EGG);
        recipe20.setIngredient('C', Material.STRING);
        Bukkit.getServer().addRecipe(recipe20);
        ShapedRecipe recipe21 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)60));
        recipe21.shape("AAA", "ABA", "AAA");
        recipe21.setIngredient('A', Material.IRON_INGOT);
        recipe21.setIngredient('B', Material.EGG);
        Bukkit.getServer().addRecipe(recipe21);
        ShapedRecipe recipe22 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)61));
        recipe22.shape("AAA", "ABA", "AAA");
        recipe22.setIngredient('A', Material.BLAZE_ROD);
        recipe22.setIngredient('B', Material.EGG);
        Bukkit.getServer().addRecipe(recipe22);
        ShapedRecipe recipe23 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)62));
        recipe23.shape("AAA", "ABA", "AAA");
        recipe23.setIngredient('A', Material.MAGMA_CREAM);
        recipe23.setIngredient('B', Material.EGG);
        Bukkit.getServer().addRecipe(recipe23);
        ShapedRecipe recipe24 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 0, (short)63));
        recipe24.shape("AAA", "ABA", "AAA");
        recipe24.setIngredient('A', Material.DRAGON_EGG);
        recipe24.setIngredient('B', Material.EGG);
        Bukkit.getServer().addRecipe(recipe24);
        ShapedRecipe recipe25 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)90));
        recipe25.shape("AAA", "ABA", "AAA");
        recipe25.setIngredient('A', Material.PORK);
        recipe25.setIngredient('B', Material.EGG);
        Bukkit.getServer().addRecipe(recipe25);
        ShapedRecipe recipe26 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)91));
        recipe26.shape("AAA", "ABA", "AAA");
        recipe26.setIngredient('A', Material.WOOL);
        recipe26.setIngredient('B', Material.EGG);
        Bukkit.getServer().addRecipe(recipe26);
        ShapedRecipe recipe27 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)92));
        recipe27.shape("ACA", "CBC", "ACA");
        recipe27.setIngredient('A', Material.RAW_BEEF);
        recipe27.setIngredient('B', Material.EGG);
        recipe27.setIngredient('C', Material.LEATHER);
        Bukkit.getServer().addRecipe(recipe27);
        ShapedRecipe recipe28 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)93));
        recipe28.shape("AAA", "ABA", "AAA");
        recipe28.setIngredient('A', Material.FEATHER);
        recipe28.setIngredient('B', Material.EGG);
        Bukkit.getServer().addRecipe(recipe28);
        ShapedRecipe recipe29 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)94));
        recipe29.shape("AAA", "ABA", "AAA");
        recipe29.setIngredient('A', Material.INK_SACK);
        recipe29.setIngredient('B', Material.EGG);
        Bukkit.getServer().addRecipe(recipe29);
        ShapedRecipe recipe30 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)95));
        recipe30.shape("ACA", "CBC", "ACA");
        recipe30.setIngredient('A', Material.WOOL);
        recipe30.setIngredient('B', Material.EGG);
        recipe30.setIngredient('C', Material.BONE);
        Bukkit.getServer().addRecipe(recipe30);
        ShapedRecipe recipe31 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)96));
        recipe31.shape("ACA", "CBC", "ACA");
        recipe31.setIngredient('A', Material.RAW_BEEF);
        recipe31.setIngredient('B', Material.EGG);
        recipe31.setIngredient('C', Material.RED_MUSHROOM);
        Bukkit.getServer().addRecipe(recipe31);
        ShapedRecipe recipe32 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)97));
        recipe32.shape("ACA", "ABA", "AAA");
        recipe32.setIngredient('A', Material.SNOW_BALL);
        recipe32.setIngredient('B', Material.EGG);
        recipe32.setIngredient('C', Material.PUMPKIN);
        Bukkit.getServer().addRecipe(recipe32);
        ShapedRecipe recipe33 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)98));
        recipe33.shape("ACA", "CBC", "ACA");
        recipe33.setIngredient('A', Material.WOOL);
        recipe33.setIngredient('B', Material.EGG);
        recipe33.setIngredient('C', Material.RAW_FISH);
        Bukkit.getServer().addRecipe(recipe33);
        ShapedRecipe recipe38 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)99));
        recipe38.shape(" A ", "CBC", "C C");
        recipe38.setIngredient('A', Material.PUMPKIN);
        recipe38.setIngredient('B', Material.EGG);
        recipe38.setIngredient('C', Material.IRON_BLOCK);
        Bukkit.getServer().addRecipe(recipe38);
        ShapedRecipe recipe34 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)200));
        recipe34.shape("AAA", "ABA", "ACA");
        recipe34.setIngredient('A', Material.GLASS);
        recipe34.setIngredient('B', Material.EGG);
        recipe34.setIngredient('C', Material.FLINT_AND_STEEL);
        Bukkit.getServer().addRecipe(recipe34);
        ShapelessRecipe recipe35 = new ShapelessRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)40));
        recipe35.addIngredient(Material.MINECART);
        recipe35.addIngredient(Material.EGG);
        Bukkit.getServer().addRecipe(recipe35);
        ShapelessRecipe recipe36 = new ShapelessRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)41));
        recipe36.addIngredient(Material.BOAT);
        recipe36.addIngredient(Material.EGG);
        Bukkit.getServer().addRecipe(recipe36);
        ShapedRecipe recipe37 = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)120));
        recipe37.shape("ACA", "CBC", "ACA");
        recipe37.setIngredient('A', Material.PORK);
        recipe37.setIngredient('B', Material.EGG);
        recipe37.setIngredient('C', Material.LEATHER);
        Bukkit.getServer().addRecipe(recipe37);
        log.info("SynthMaterials by Owexz (Owexz.net) Enabled");
    }
 
    public void onDisable()
    {
        log.info("SynthMaterials disabled.");
    }
 
    public static CustomBlock compressedcoalBlock;
    Logger log;
    public Texture compressedcoalBlockTexture;
}