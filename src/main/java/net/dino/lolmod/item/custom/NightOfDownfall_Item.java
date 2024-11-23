package net.dino.lolmod.item.custom;

import net.dino.lolmod.item.CreativeTab_ModItems;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

import net.minecraft.world.damagesource.DamageSource;

public class NightOfDownfall_Item extends SwordItem {

	// 공격력
    private final int attackDamage;

    // 아이템 생성자
    public NightOfDownfall_Item(Tier tier, int attackDamageBonus, float attackSpeed) {
        super(tier, attackDamageBonus, attackSpeed, new Properties().tab(CreativeTab_ModItems.MAIN));
        this.attackDamage = (int) (tier.getAttackDamageBonus() + attackDamageBonus);  // 총 공격력 설정
    }

    // 엔티티 : 공격력 적용
    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (attacker instanceof Player player) {
            DamageSource damageSource = DamageSource.playerAttack(player);
            target.hurt(damageSource, this.attackDamage);  
        }
        return super.hurtEnemy(stack, target, attacker);
    }


    // 아이템 스택 수
    @Override
    public int getMaxStackSize(ItemStack stack) {
        return 1;
    }
}
