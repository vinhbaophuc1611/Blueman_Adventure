public class AssetSetter {
    GamePanel gp;
    public AssetSetter(GamePanel gp){
        this.gp = gp;
    }
    public void setobject(){
        int mapNum = 1;
        gp.obj[mapNum][0] = new OBJ_KEY(gp);
        gp.obj[mapNum][0].worldX = 43 * gp.tileSize;
        gp.obj[mapNum][0].worldY = 38 * gp.tileSize;

        gp.obj[mapNum][1] = new OBJ_DOOR(gp);
        gp.obj[mapNum][1].worldX = 41 * gp.tileSize;
        gp.obj[mapNum][1].worldY = 19 * gp.tileSize;

        gp.obj[mapNum][2] = new OBJ_DOOR(gp);
        gp.obj[mapNum][2].worldX = 53 * gp.tileSize;
        gp.obj[mapNum][2].worldY = 52 * gp.tileSize;

        gp.obj[mapNum][3] = new OBJ_DOOR(gp);
        gp.obj[mapNum][3].worldX = 10 * gp.tileSize;
        gp.obj[mapNum][3].worldY = 25 * gp.tileSize;

        gp.obj[mapNum][4] = new OBJ_KEY(gp);
        gp.obj[mapNum][4].worldX = 22 * gp.tileSize;
        gp.obj[mapNum][4].worldY = 28 * gp.tileSize;

        gp.obj[mapNum][5] = new OBJ_KEY(gp);
        gp.obj[mapNum][5].worldX = 17 * gp.tileSize;
        gp.obj[mapNum][5].worldY = 17 * gp.tileSize;

        gp.obj[mapNum][6] = new OBJ_KEY(gp);
        gp.obj[mapNum][6].worldX = 12 * gp.tileSize;
        gp.obj[mapNum][6].worldY = 43 * gp.tileSize;

        gp.obj[mapNum][7] = new OBJ_KEY(gp);
        gp.obj[mapNum][7].worldX = 32 * gp.tileSize;
        gp.obj[mapNum][7].worldY = 12 * gp.tileSize;

        gp.obj[mapNum][8] = new OBJ_DOOR(gp);
        gp.obj[mapNum][8].worldX = 24 * gp.tileSize;
        gp.obj[mapNum][8].worldY = 8 * gp.tileSize;
    }

    public void setNPC(){
        int mapNum = 1;
        gp.npc[mapNum][0] = new NPC_OLDMAN(gp);
        gp.npc[mapNum][0].worldX = gp.tileSize * 15;
        gp.npc[mapNum][0].worldY = gp.tileSize * 15;

        gp.npc[mapNum][1] = new NPC_OLDMAN(gp);
        gp.npc[mapNum][1].worldX = gp.tileSize * 31;
        gp.npc[mapNum][1].worldY = gp.tileSize * 12;

        gp.npc[mapNum][2] = new NPC_OLDMAN(gp);
        gp.npc[mapNum][2].worldX = gp.tileSize * 31;
        gp.npc[mapNum][2].worldY = gp.tileSize * 37;

        gp.npc[mapNum][3] = new NPC_OLDMAN(gp);
        gp.npc[mapNum][3].worldX = gp.tileSize * 24;
        gp.npc[mapNum][3].worldY = gp.tileSize * 27;

        gp.npc[mapNum][4] = new NPC_OLDMAN(gp);
        gp.npc[mapNum][4].worldX = gp.tileSize * 44;
        gp.npc[mapNum][4].worldY = gp.tileSize * 18;
    }

    public void setMonster(){
        int mapNum = 1;
        gp.monster[mapNum][0] = new MON(gp);
        gp.monster[mapNum][0].worldX = gp.tileSize * 17;
        gp.monster[mapNum][0].worldY = gp.tileSize * 7;

        gp.monster[mapNum][1] = new MON(gp);
        gp.monster[mapNum][1].worldX = gp.tileSize * 10;
        gp.monster[mapNum][1].worldY = gp.tileSize * 16;
        
        gp.monster[mapNum][2] = new MON(gp);
        gp.monster[mapNum][2].worldX = gp.tileSize * 44;
        gp.monster[mapNum][2].worldY = gp.tileSize * 30;

        gp.monster[mapNum][3] = new MON(gp);
        gp.monster[mapNum][3].worldX = gp.tileSize * 11;
        gp.monster[mapNum][3].worldY = gp.tileSize * 39;

        gp.monster[mapNum][4] = new MON(gp);
        gp.monster[mapNum][4].worldX = gp.tileSize * 33;
        gp.monster[mapNum][4].worldY = gp.tileSize * 36;

        gp.monster[mapNum][5] = new MON(gp);
        gp.monster[mapNum][5].worldX = gp.tileSize * 11;
        gp.monster[mapNum][5].worldY = gp.tileSize * 39;
    }
}
