package prototype;

class PrototypeMain {
    public static void main(final String... args) throws Exception {
        //creating npc's is time/resource heavy, sow we create only one instance and clone it whenever is needed
        NPCStore npcCreator = new NPCStore();

        npcCreator.createNPC("enemy").attack();
        npcCreator.createNPC("enemy").attack();
        npcCreator.createNPC("enemy").attack();
        npcCreator.createNPC("enemy").attack();
        npcCreator.createNPC("friendly").attack();
        npcCreator.createNPC("friendly").attack();
        npcCreator.createNPC("friendly").attack();
        npcCreator.createNPC("friendly").attack();
    }
}
