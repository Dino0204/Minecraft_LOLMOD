package net.dino.lolmod.item.custom;

import net.dino.lolmod.item.CreativeTab_ModItems;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.damagesource.DamageSource;

public class NoxianGuillotine_Item extends SwordItem {

    private final int attackDamage;
    private int hitCount = 0; // 타격 카운트

    // 아이템 생성자
    public NoxianGuillotine_Item(Tier tier, int attackDamageBonus, float attackSpeed) {
        super(tier, attackDamageBonus, attackSpeed, new Properties().tab(CreativeTab_ModItems.MAIN));
        this.attackDamage = (int) (tier.getAttackDamageBonus() + attackDamageBonus); // 총 공격력 설정
    }

    // 엔티티 : 공격력 적용
    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (attacker instanceof Player player) {
            DamageSource damageSource = DamageSource.playerAttack(player);
            target.hurt(damageSource, this.attackDamage);

            // 타격 카운트 증가
            hitCount++;
            System.out.println("Hit count: " + hitCount); // 콘솔에 카운트 출력
        }
        return super.hurtEnemy(stack, target, attacker);
    }

    // 아이템 스택 수
    @Override
    public int getMaxStackSize(ItemStack stack) {
        return 1; // 이 아이템은 하나만 가질 수 있음
    }
}
