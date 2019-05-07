/*
 * Copyright (c) 2018, https://runelitepl.us
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.autoprayerswitch;

public enum WeaponMap
{
  NONE(-1, Prayer.PROTECT_FROM_MELEE),
  DDS(5698, Prayer.PROTECT_FROM_MELEE),
  DDP(5680, Prayer.PROTECT_FROM_MELEE),
  DD(1215, Prayer.PROTECT_FROM_MELEE),
  DDPP(1231, Prayer.PROTECT_FROM_MELEE),
  WHIP(4151, Prayer.PROTECT_FROM_MELEE),
  D_SCIM(4587, Prayer.PROTECT_FROM_MELEE),
  TENTACLE(12006, Prayer.PROTECT_FROM_MELEE),
  AGS(11802, Prayer.PROTECT_FROM_MELEE),
  G_MAUL(4153, Prayer.PROTECT_FROM_MELEE),
  DWH(13576, Prayer.PROTECT_FROM_MELEE),
  D_CLAWS(13652, Prayer.PROTECT_FROM_MELEE),
  STAT_WH(22622, Prayer.PROTECT_FROM_MELEE),
  VEST_LS(22613, Prayer.PROTECT_FROM_MELEE),
  VEST_SPEAR(22610, Prayer.PROTECT_FROM_MELEE),
  BGS(11804, Prayer.PROTECT_FROM_MELEE),
  ZGS(11808, Prayer.PROTECT_FROM_MELEE),
  SGS(11806, Prayer.PROTECT_FROM_MELEE),
  RAPIER(22324, Prayer.PROTECT_FROM_MELEE),
  DMACE(1434, Prayer.PROTECT_FROM_MELEE),
  D2H(7158, Prayer.PROTECT_FROM_MELEE),
  DHAL(3204, Prayer.PROTECT_FROM_MELEE),
  DSPEAR(1249, Prayer.PROTECT_FROM_MELEE),
  DSPEARPP(5716, Prayer.PROTECT_FROM_MELEE),
  DSPEARP(1263, Prayer.PROTECT_FROM_MELEE),
  DSPEARPPP(5730, Prayer.PROTECT_FROM_MELEE),
  ELDER(21003, Prayer.PROTECT_FROM_MELEE),
  ELDER_2(21205, Prayer.PROTECT_FROM_MELEE),
  LEAF(20727, Prayer.PROTECT_FROM_MELEE),
  RUNE_CBOW(9185, Prayer.PROTECT_FROM_MISSILES),
  HEAVY_BAL(19481, Prayer.PROTECT_FROM_MISSILES),
  LIGHT_BAL(19478, Prayer.PROTECT_FROM_MISSILES),
  DRAG_CBOW(21902, Prayer.PROTECT_FROM_MISSILES),
  ACB(11785, Prayer.PROTECT_FROM_MISSILES),
  MOR_JAV(22636, Prayer.PROTECT_FROM_MISSILES),
  MOR_TA(22634, Prayer.PROTECT_FROM_MISSILES),
  DARK_BOW(11235, Prayer.PROTECT_FROM_MISSILES),
  DARK_BOW2(12765, Prayer.PROTECT_FROM_MISSILES),
  DARK_BOW3(12766, Prayer.PROTECT_FROM_MISSILES),
  DARK_BOW4(12767, Prayer.PROTECT_FROM_MISSILES),
  DARK_BOW5(12768, Prayer.PROTECT_FROM_MISSILES),
  BLOW_PIPE(12926, Prayer.PROTECT_FROM_MISSILES),
  MSB(861, Prayer.PROTECT_FROM_MISSILES),
  MSB2(20558, Prayer.PROTECT_FROM_MISSILES),
  MSB3(12788, Prayer.PROTECT_FROM_MISSILES),
  DK(22804, Prayer.PROTECT_FROM_MISSILES),
  DK2(22812, Prayer.PROTECT_FROM_MISSILES),
  DK3(22814, Prayer.PROTECT_FROM_MISSILES),
  DKP(22806, Prayer.PROTECT_FROM_MISSILES),
  DKP2(22808, Prayer.PROTECT_FROM_MISSILES),
  DKP3(22810, Prayer.PROTECT_FROM_MISSILES),
  RK(868, Prayer.PROTECT_FROM_MISSILES),
  RKP(876, Prayer.PROTECT_FROM_MISSILES),
  RKP2(5660, Prayer.PROTECT_FROM_MISSILES),
  RKP3(5667, Prayer.PROTECT_FROM_MISSILES),
  ANCIENT_STAFF(4675, Prayer.PROTECT_FROM_MAGIC),
  ZURIEL(22647, Prayer.PROTECT_FROM_MAGIC),
  MASTER_WAND(6914, Prayer.PROTECT_FROM_MAGIC),
  AHRIM(4710, Prayer.PROTECT_FROM_MAGIC),
  AHRIM_25(4865, Prayer.PROTECT_FROM_MAGIC),
  AHRIM_50(4864, Prayer.PROTECT_FROM_MAGIC),
  AHRIM_75(4863, Prayer.PROTECT_FROM_MAGIC),
  AHRIM_100(4862, Prayer.PROTECT_FROM_MAGIC),
  KODAI(21006, Prayer.PROTECT_FROM_MAGIC),
  TOXIC(12904, Prayer.PROTECT_FROM_MAGIC),
  STAFF_OF_DEAD(11791, Prayer.PROTECT_FROM_MAGIC),
  TOXIC_TRIDENT_U(12900, Prayer.PROTECT_FROM_MAGIC),
  TRIDENT_U(11908, Prayer.PROTECT_FROM_MAGIC),
  STAFF_LIGHT(22296, Prayer.PROTECT_FROM_MAGIC),
  WATER_BSTAFF(1395, Prayer.PROTECT_FROM_MAGIC),
  WATER_STAFF(1383, Prayer.PROTECT_FROM_MAGIC),
  WATER_MSTAFF(1403, Prayer.PROTECT_FROM_MAGIC),
  MUD(6562, Prayer.PROTECT_FROM_MAGIC),
  MUD2(6563, Prayer.PROTECT_FROM_MAGIC),
  MUD3(11998, Prayer.PROTECT_FROM_MAGIC),
  MUD4(12000, Prayer.PROTECT_FROM_MAGIC),
  MUD5(772, Prayer.PROTECT_FROM_MAGIC),
  MUD6(20736, Prayer.PROTECT_FROM_MAGIC),
  MUD7(20739, Prayer.PROTECT_FROM_MAGIC),
  MUD8(20736, Prayer.PROTECT_FROM_MAGIC),
  MUD9(20736, Prayer.PROTECT_FROM_MAGIC),
  MUD10(20736, Prayer.PROTECT_FROM_MAGIC),
  ZAM(2417, Prayer.PROTECT_FROM_MAGIC),
  GUTH(2416, Prayer.PROTECT_FROM_MAGIC),
  SARA(2415, Prayer.PROTECT_FROM_MAGIC),
  TOX(22292, Prayer.PROTECT_FROM_MAGIC),
  TOX2(12899, Prayer.PROTECT_FROM_MAGIC),
  TOX3(11907, Prayer.PROTECT_FROM_MAGIC),
  TOX4(22288, Prayer.PROTECT_FROM_MAGIC);

  private final int id;
  private final Prayer prayer;

  public static Prayer getMappingForID(final int id) {
    for (final WeaponMap map : values()) {
      if (map.id == id) {
        return map.prayer;
      }
    }
    return null;
  }

  private WeaponMap(final int id, final Prayer prayer) {
    this.id = id;
    this.prayer = prayer;
  }
}