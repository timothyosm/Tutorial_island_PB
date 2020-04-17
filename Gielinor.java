package tutorial;


import org.powerbot.script.Condition;
import org.powerbot.script.Tile;
import org.powerbot.script.rt4.*;
import org.powerbot.script.rt4.Inventory;

import java.util.concurrent.Callable;

public class Gielinor extends Task {

    int gielinorGuideid = 3308;
    int survivalExpertid = 8503;
    int fishingSpotid = 3317;
    int treeId = 9730;
    int logId = 2511;
    int tinderBoxId = 590;
    int shrimpId = 2514;
    int fireId = 26185;
    int masterChefid = 3305;
    int flourId = 2516;
    int bucketOfwaterid = 1929;
    int doughId = 2307;
    int rangeId = 9736;
    int questGuideid = 3312;
    int questLadderid = 9726;
    int miningInstructorId = 3311;
    int tinOreid = 10080;
    int copperOreid = 10079;
    int furnaceId = 24011;
    int anvilId = 2097;
    int gateId = 9718;
    int gateToratsid = 9720;
    int combatInstructorid = 3307;
    int bronzeDaggerid = 1205;
    int bronzeSwordid = 1277;
    int woodenShieldid = 1171;
    int giantRatid = 3313;
    int shortbowid = 841;
    int bronzeArrowsid = 882;
    int bankBoothid = 10083;
    int pollBoothid = 26801;
    int accountGuideid = 3310;
    int brotherBraceid = 3319;
    int magicInstructorid = 3309;

    Item log = ctx.inventory.select().id(logId).poll();
    Item tinderBox = ctx.inventory.select().id(tinderBoxId).poll();
    Item shrimp = ctx.inventory.select().id(shrimpId).poll();
    Item flour = ctx.inventory.select().id(flourId).poll();
    Item bucketOfwater = ctx.inventory.select().id(bucketOfwaterid).poll();
    Item dough = ctx.inventory.select().id(doughId).poll();
    Item bronzeDagger = ctx.inventory.select().id(bronzeDaggerid).poll();
    Item bronzeSword = ctx.inventory.select().id(bronzeSwordid).poll();
    Item woodenShield = ctx.inventory.select().id(woodenShieldid).poll();
    Item shortbow = ctx.inventory.select().id(shortbowid).poll();
    Item bronzeArrows = ctx.inventory.select().id(bronzeArrowsid).poll();

    Npc gielinorGuide = ctx.npcs.select().id(gielinorGuideid).poll();
    Npc survivalExpert = ctx.npcs.select().id(survivalExpertid).poll();
    Npc masterChef = ctx.npcs.select().id(masterChefid).poll();
    Npc fishingSpot = ctx.npcs.select().id(fishingSpotid).poll();
    Npc questGuide = ctx.npcs.select().id(questGuideid).poll();
    Npc miningInstructor = ctx.npcs.select().id(miningInstructorId).poll();
    Npc combatInstructor = ctx.npcs.select().id(combatInstructorid).poll();
    Npc giantRat = ctx.npcs.select().id(giantRatid).poll();
    Npc accountGuide = ctx.npcs.select().id(accountGuideid).poll();
    Npc brotherBrace = ctx.npcs.select().id(brotherBraceid).poll();
    Npc magicInstructor = ctx.npcs.select().id(magicInstructorid).poll();

    GameObject tree = ctx.objects.select().id(treeId).nearest().poll();
    GameObject fire = ctx.objects.select().id(fireId).nearest().poll();
    GameObject range = ctx.objects.select().id(rangeId).nearest().poll();
    GameObject questLadder = ctx.objects.select().id(questLadderid).nearest().poll();
    GameObject tinOre = ctx.objects.select().id(tinOreid).nearest().poll();
    GameObject copperOre = ctx.objects.select().id(copperOreid).nearest().poll();
    GameObject furnace = ctx.objects.select().id(furnaceId).nearest().poll();
    GameObject anvil = ctx.objects.select().id(anvilId).nearest().poll();
    GameObject gate = ctx.objects.select().id(gateId).nearest().poll();
    GameObject gateTorats = ctx.objects.select().id(gateToratsid).nearest().poll();
    GameObject bankBooth = ctx.objects.select().id(bankBoothid).nearest().poll();
    GameObject pollBooth = ctx.objects.select().id(pollBoothid).nearest().poll();

    Walker walker = new Walker(ctx);

    public static final Tile[] pathTo2ndtutorial = {
            new Tile(3093, 3107, 0),
            new Tile(3096, 3107, 0),
            new Tile(3099, 3106, 0),
            new Tile(3101, 3103, 0),
            new Tile(3101, 3100, 0),
            new Tile(3102, 3097, 0)};
    public static final Tile[] pathTo3rdtutorial = {
            new Tile(3102, 3095, 0),
            new Tile(3099, 3094, 0),
            new Tile(3096, 3092, 0),
            new Tile(3093, 3092, 0),
            new Tile(3090, 3091, 0),
            new Tile(3088, 3094, 0),
            new Tile(3085, 3093, 0),
            new Tile(3085, 3090, 0),
            new Tile(3084, 3087, 0),
            new Tile(3081, 3084, 0),
            new Tile(3077, 3084, 0)};
    public static final Tile[] pathTo4thtutorial = {
            new Tile(3075, 3088, 0),
            new Tile(3072, 3090, 0),
            new Tile(3072, 3093, 0),
            new Tile(3071, 3096, 0),
            new Tile(3071, 3099, 0),
            new Tile(3071, 3102, 0),
            new Tile(3073, 3105, 0),
            new Tile(3076, 3106, 0),
            new Tile(3077, 3109, 0),
            new Tile(3077, 3112, 0),
            new Tile(3077, 3115, 0),
            new Tile(3077, 3118, 0),
            new Tile(3076, 3121, 0),
            new Tile(3076, 3124, 0),
            new Tile(3079, 3125, 0),
            new Tile(3082, 3126, 0),
            new Tile(3085, 3126, 0),
            new Tile(3086, 3123, 0)};
    public static final Tile[] pathTo5thtutorial = {
            new Tile(3088, 9520, 0),
            new Tile(3085, 9521, 0),
            new Tile(3082, 9520, 0),
            new Tile(3079, 9517, 0),
            new Tile(3079, 9514, 0),
            new Tile(3080, 9511, 0),
            new Tile(3081, 9508, 0),
            new Tile(3080, 9505, 0),
            new Tile(3079, 9502, 0)};
    public static final Tile[] pathToct = {
            new Tile(3105, 9518, 0),
            new Tile(3108, 9518, 0),
            new Tile(3111, 9519, 0),
            new Tile(3112, 9516, 0),
            new Tile(3111, 9513, 0),
            new Tile(3108, 9511, 0),
            new Tile(3106, 9508, 0)};
    public static final Tile[] pathOutofcave = {
            new Tile(3107, 9512, 0),
            new Tile(3110, 9513, 0),
            new Tile(3112, 9516, 0),
            new Tile(3112, 9519, 0),
            new Tile(3112, 9522, 0),
            new Tile(3112, 9525, 0),
            new Tile(3112, 3126, 0),
            new Tile(3112, 3126, 0),
            new Tile(3112, 3123, 0),
            new Tile(3113, 3120, 0),
            new Tile(3115, 3117, 0),
            new Tile(3118, 3115, 0),
            new Tile(3121, 3114, 0),
            new Tile(3121, 3117, 0),
            new Tile(3121, 3120, 0),
            new Tile(3121, 3123, 0)};
    public static final Tile[] pathTobanker = {
            new Tile(3120, 3121, 0),
            new Tile(3123, 3123, 0),
            new Tile(3126, 3124, 0)};
    public static final Tile[] pathTomonk = {
            new Tile(3125, 3124, 0),
            new Tile(3128, 3124, 0),
            new Tile(3131, 3124, 0),
            new Tile(3133, 3121, 0),
            new Tile(3134, 3118, 0),
            new Tile(3133, 3115, 0),
            new Tile(3131, 3112, 0),
            new Tile(3130, 3109, 0),
            new Tile(3127, 3107, 0),
            new Tile(3124, 3107, 0)};
    public static final Tile[] pathTowizard = {
            new Tile(3123, 3105, 0),
            new Tile(3122, 3102, 0),
            new Tile(3124, 3099, 0),
            new Tile(3126, 3096, 0),
            new Tile(3128, 3093, 0),
            new Tile(3130, 3090, 0),
            new Tile(3133, 3088, 0),
            new Tile(3136, 3087, 0),
            new Tile(3139, 3087, 0),
            new Tile(3141, 3090, 0)};




    public Gielinor(ClientContext ctx) {
        super(ctx);
    }

    @Override
    public boolean activate() {
        return true;
    }

    @Override
    public void execute() {
        System.out.println(ctx.varpbits.varpbit(281));
        if (ctx.varpbits.varpbit(1021) == 2060 && !(ctx.varpbits.varpbit(281) == 10)) {
            if (gielinorGuide.inViewport() && !ctx.chat.chatting()) {
                gielinorGuide.interact("Talk-To");
            } else {
                ctx.camera.turnTo(gielinorGuide);
            }
            if (ctx.chat.canContinue()) {
                ctx.chat.clickContinue(true);

            }
        }
        if (ctx.varpbits.varpbit(1021) == 2048) {
            if (gielinorGuide.inViewport() && ctx.chat.chatting()) {
                ChatOption chat = ctx.chat.select().text("i am an experienced player.").poll();
                chat.select(true);
            }
            if (ctx.varpbits.varpbit(281) == 3) {
                ctx.widgets.component(164, 39).click();
            }
            if (ctx.varpbits.varpbit(281) == 10) {
                System.out.println("Done gielinorGuide");
                walker.walkPath(pathTo2ndtutorial);
            }
        }
        if (ctx.varpbits.varpbit(281) == 20) {
            if (survivalExpert.inViewport() && !ctx.chat.chatting()) {
                survivalExpert.interact("Talk-To");
            } else {
                ctx.camera.turnTo(survivalExpert);
            }
        }
        if (ctx.varpbits.varpbit(281) == 30) {
            if (ctx.chat.canContinue()) {
                ctx.chat.clickContinue(true);

            } else if (ctx.varpbits.varpbit(1021) == 2052) {
                ctx.widgets.component(164, 55).click();
            }

        }
        if (ctx.varpbits.varpbit(281) == 40) {
            fishingSpot.interact("Net");
        }
        if (ctx.varpbits.varpbit(281) == 50) {
            ctx.widgets.component(164, 60).click();

        }
        if (ctx.varpbits.varpbit(281) == 60) {
            if (survivalExpert.inViewport() && !ctx.chat.chatting()) {
                survivalExpert.interact("Talk-To");
            } else {
                ctx.camera.turnTo(survivalExpert);
            }
            if (ctx.chat.canContinue()) {
                ctx.chat.clickContinue(true);
            }

        }

        if (ctx.varpbits.varpbit(281) == 70) {
            if (ctx.chat.canContinue()) {
                ctx.chat.clickContinue(true);
            } else {
                tree.interact("Chop Down");
            }
        }

        if (ctx.varpbits.varpbit(281) == 80) {
            if (ctx.chat.canContinue()) {
                ctx.chat.clickContinue(true);
            } else {
                log.interact("Use");
                tinderBox.interact("Use");
            }
        }
        if (ctx.varpbits.varpbit(281) == 90) {
            if (ctx.chat.canContinue()) {
                ctx.chat.clickContinue(true);
            } else {
                shrimp.interact("Use");
                fire.interact("Use");
            }
        }
        if (ctx.varpbits.varpbit(281) == 120) {
            walker.walkPath(pathTo3rdtutorial);
        }

        if (ctx.varpbits.varpbit(281) == 130) {
            walker.walkPath(pathTo3rdtutorial);
        }
        if (ctx.varpbits.varpbit(281) == 140) {
            if (masterChef.inViewport() && !ctx.chat.chatting()) {
                masterChef.interact("Talk-To");
            } else {
                ctx.camera.turnTo(masterChef);
            }
            if (ctx.chat.canContinue()) {
                ctx.chat.clickContinue(true);
            }
        }
        if (ctx.varpbits.varpbit(281) == 150) {
            if (ctx.chat.canContinue()) {
                ctx.chat.clickContinue(true);
            } else {
                flour.interact("Use");
                bucketOfwater.interact("Use");
            }
        }
        if (ctx.varpbits.varpbit(281) == 160) {
            if (ctx.chat.canContinue()) {
                ctx.chat.clickContinue(true);
            } else {
                dough.interact("Use");
                range.interact("Use");
            }

        }
        if (ctx.varpbits.varpbit(281) == 170) {
            walker.walkPath(pathTo4thtutorial);
        }
        if (ctx.varpbits.varpbit(281) == 220) {
            if (questGuide.inViewport() && !ctx.chat.chatting()) {
                questGuide.interact("Talk-To");
            } else {
                ctx.camera.turnTo(questGuide);
            }
            if (ctx.chat.canContinue()) {
                ctx.chat.clickContinue(true);

            }
        }

        if (ctx.varpbits.varpbit(281) == 230) {
            ctx.widgets.component(164, 54).click();
        }
        if (ctx.varpbits.varpbit(281) == 240) {
            if (questGuide.inViewport() && !ctx.chat.chatting()) {
                questGuide.interact("Talk-To");

            } else if (ctx.chat.canContinue()) {
                ctx.chat.clickContinue(true);

            } else {
                ctx.camera.turnTo(questGuide);
            }
        }
        if (ctx.varpbits.varpbit(281) == 250) {
            if (ctx.chat.canContinue()) {
                ctx.chat.clickContinue(true);
            } else {

                questLadder.interact("Climb-down");
            }
        }

        if (ctx.varpbits.varpbit(281) == 260 && ctx.varpbits.varpbit(406) == 7) {
            walker.walkPath(pathTo5thtutorial);
        }


        if (ctx.varpbits.varpbit(281) == 260 || ctx.varpbits.varpbit(281) == 270) {

            if (miningInstructor.inViewport() && !ctx.chat.chatting()) {
                miningInstructor.interact("Talk-To");
            } else {
                ctx.camera.turnTo(miningInstructor);
            }
            if (ctx.chat.canContinue()) {
                ctx.chat.clickContinue(true);

            }
        }

        if (ctx.varpbits.varpbit(281) == 300) {
            tinOre.interact("Mine");
        }
        if (ctx.varpbits.varpbit(281) == 310) {
            copperOre.interact("Mine");
        }

        if (ctx.varpbits.varpbit(281) == 320) {
            furnace.interact("Use");

        }
        if (ctx.varpbits.varpbit(281) == 330) {
            if (miningInstructor.inViewport() && !ctx.chat.chatting()) {
                miningInstructor.interact("Talk-To");
            } else {
                ctx.camera.turnTo(miningInstructor);
            }
            if (ctx.chat.canContinue()) {
                ctx.chat.clickContinue(true);
            }
        }
        if (ctx.varpbits.varpbit(281) == 340) {
            anvil.interact("Smith");

        }
        if (ctx.varpbits.varpbit(281) == 350) {
            if (ctx.widgets.component(312, 9, 2).click()) {
                ctx.widgets.component(312, 9, 2).click();
            }
        }
        if (ctx.varpbits.varpbit(281) == 360) {
            if (gate.inViewport()) {
                gate.interact("Open");
            } else {
                ctx.camera.turnTo(gate);
            }

        }

        if (ctx.varpbits.varpbit(281) == 370) {
            if (combatInstructor.inViewport() && !ctx.chat.chatting()) {
                combatInstructor.interact("Talk-To");
            } else {
                ctx.camera.turnTo(combatInstructor);
            }
            if (ctx.chat.canContinue()) {
                ctx.chat.clickContinue(true);
            }
        }

        if (ctx.varpbits.varpbit(281) == 390) {

            if (ctx.chat.canContinue()) {
                ctx.chat.clickContinue(true);
            } else {
                ctx.widgets.component(164, 56).click();
            }
        }
        if (ctx.varpbits.varpbit(281) == 400) {
            ctx.widgets.component(387, 2).click();
        }
        if (ctx.varpbits.varpbit(281) == 405) {
            bronzeDagger.interact("Equip");
        }
        if (ctx.varpbits.varpbit(281) == 410) {
            if (combatInstructor.inViewport() && !ctx.chat.chatting()) {
                combatInstructor.interact("Talk-To");
            } else {
                ctx.camera.turnTo(combatInstructor);
            }
            if (ctx.chat.canContinue()) {
                ctx.chat.clickContinue(true);
            }
        }
        if (ctx.varpbits.varpbit(281) == 420) {
            bronzeSword.interact("Wield");
            woodenShield.interact("Wield");
        }
        if (ctx.varpbits.varpbit(281) == 430) {
            ctx.widgets.component(164, 52).click();

        }
        if (ctx.varpbits.varpbit(281) == 440) {
            if (gateTorats.inViewport()) {
                gateTorats.interact("Open");
            } else {
                ctx.camera.turnTo(gateTorats);
            }

        }

        if (ctx.varpbits.varpbit(281) == 450) {

            if (giantRat.inViewport()) {
                giantRat.interact("Attack");
                Callable<Boolean> booleanCallable = new Callable<Boolean>() {
                    @Override
                    public Boolean call() throws Exception {
                        return ctx.players.local().interacting().valid();
                    }
                };
                Condition.wait(booleanCallable, 100, 25);
            } else {
                ctx.camera.turnTo(giantRat);
            }
            walker.walkPath(pathToct);
            Condition.sleep(5000);
        }

        if (ctx.varpbits.varpbit(281) == 470) {
            if (combatInstructor.inViewport() && !ctx.chat.chatting()) {

                combatInstructor.interact("Talk-To");
            } else {
                ctx.camera.turnTo(combatInstructor);
            }
            if (ctx.chat.canContinue()) {
                ctx.chat.clickContinue(true);
            }
        }

        if (ctx.varpbits.varpbit(281) == 480) {
            shortbow.interact("Wield");
            bronzeArrows.interact("Wield");
            if (giantRat.inViewport()) {
                giantRat.interact("Attack");
                Callable<Boolean> booleanCallable = new Callable<Boolean>() {
                    @Override
                    public Boolean call() throws Exception {
                        return ctx.players.local().interacting().valid();
                    }
                };
                Condition.wait(booleanCallable, 100, 25);
            } else {
                ctx.camera.turnTo(giantRat);
            }
        }

        if (ctx.varpbits.varpbit(281) == 500) {
            walker.walkPath(pathOutofcave);
        }
        if (ctx.varpbits.varpbit(281) == 510) {
            if (bankBooth.inViewport()) {
                bankBooth.interact("Use");
            } else {
                ctx.camera.turnTo(bankBooth);
            }
        }
        if (ctx.varpbits.varpbit(281) == 520) {
            ctx.widgets.component(12, 2, 11).click();
            if (pollBooth.inViewport() && !ctx.chat.chatting()) {
                pollBooth.interact("Use");
            }
            if (ctx.widgets.component(229, 2).click()) {
                ctx.widgets.component(229, 2).click();
            } else if (ctx.widgets.component(193, 0, 2).click()) {
                ctx.widgets.component(193, 0, 2).click();
            } else if (ctx.widgets.component(310, 2, 11).click()) {
                ctx.widgets.component(310, 2, 11).click();
            } else {
                ctx.camera.turnTo(pollBooth);
            }
        }
        if (ctx.varpbits.varpbit(281) == 525) {
            walker.walkPath(pathTobanker);
        }
        if (ctx.varpbits.varpbit(281) == 530) {
            if (accountGuide.inViewport() && !ctx.chat.chatting()) {
                accountGuide.interact("Talk-To");
            } else {
                ctx.camera.turnTo(accountGuide);
            }
            if (ctx.chat.canContinue()) {
                ctx.chat.clickContinue(true);
            }
        }
        if (ctx.varpbits.varpbit(281) == 531) {
            if (ctx.chat.canContinue()) {
                ctx.chat.clickContinue(true);
            } else {
                ctx.widgets.component(164, 38).click();

            }
        }
        if (ctx.varpbits.varpbit(281) == 532) {
            if (accountGuide.inViewport() && !ctx.chat.chatting()) {
                accountGuide.interact("Talk-To");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } else {
                ctx.camera.turnTo(accountGuide);
            }
            if (ctx.chat.canContinue()) {
                ctx.chat.clickContinue(true);
            }
        }
        if (ctx.varpbits.varpbit(281) == 540) {
//            if (accountGuide.inViewport() && !ctx.chat.chatting()) {
//                accountGuide.interact("Talk-To");
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//            } else {
//                ctx.camera.turnTo(accountGuide);
//            }
//            if (ctx.chat.canContinue()) {
//                ctx.chat.clickContinue(true);
//            }
//        }
            walker.walkPath(pathTomonk);
        }
        if (ctx.varpbits.varpbit(281) == 550) {
            if (brotherBrace.inViewport() && !ctx.chat.chatting()) {
                brotherBrace.interact("Talk-To");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } else {
                ctx.camera.turnTo(brotherBrace);
            }
            if (ctx.chat.canContinue()) {
                ctx.chat.clickContinue(true);
            }
        }
        if (ctx.varpbits.varpbit(281) == 560) {
            ctx.widgets.component(164, 57).click();
        }
        if (ctx.varpbits.varpbit(281) == 570) {
            if (brotherBrace.inViewport() && !ctx.chat.chatting()) {
                brotherBrace.interact("Talk-To");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } else {
                ctx.camera.turnTo(brotherBrace);
            }
            if (ctx.chat.canContinue()) {
                ctx.chat.clickContinue(true);
            }
        }
        if (ctx.varpbits.varpbit(281) == 580) {
            if (brotherBrace.inViewport() && !ctx.chat.chatting()) {
                brotherBrace.interact("Talk-To");
                ctx.widgets.component(164, 45).click();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } else {
                ctx.camera.turnTo(brotherBrace);
            }
            if (ctx.chat.canContinue()) {
                ctx.chat.clickContinue(true);
            }
        }
        if (ctx.varpbits.varpbit(281) == 600) {
            if (brotherBrace.inViewport() && !ctx.chat.chatting()) {
                brotherBrace.interact("Talk-To");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } else {
                ctx.camera.turnTo(brotherBrace);
            }
            if (ctx.chat.canContinue()) {
                ctx.chat.clickContinue(true);
            }
        }
        if (ctx.varpbits.varpbit(281) == 610) {
            walker.walkPath(pathTowizard);
        }
        if (ctx.varpbits.varpbit(281) == 620) {
            if (magicInstructor.inViewport() && !ctx.chat.chatting()) {
                magicInstructor.interact("Talk-To");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } else {
                ctx.camera.turnTo(magicInstructor);
            }
            if (ctx.chat.canContinue()) {
                ctx.chat.clickContinue(true);
            }
        }
    }}






