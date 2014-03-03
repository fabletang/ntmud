/split 0 2
/nop 精气神
/function {get_clor} {
/if {%1<70}{/var result <039>}{/var result <029>};
/if {%1<40}{/var result <019>}
}
/nop 内力灵力法力
/function {get_clor_2} {
/if {%1<100}{/var result <039>}{/var result <029>};
/if {%1<50}{/var result <019>}
}
/nop 食物水
/function {get_clor_3} {
/if {%1<30}{/var result <039>}{/var result <029>};
/if {%1<8}{/var result <019>}
}
/nop 敌对色彩
/var emy_clr <029>
/var emy_clr_2 <029>
/var jin_clr <029>
/var kee_clr <029>
/var sen_clr <029>
/var fce_clr <029>
/var eat_clr <029>
/var drk_clr <029>
/var atmana_clr <029>
/nop var jin_per 100
/var kee_per 100
/var sen_per 100
/var fce_per 100
/var atmana_per 100
/var emy_kee 100
/var emy_sen 100
/var npc none 
/var fce 1000
/var fce_m 1000
/nop prompt {^check status}{<039>※$myname※<099> 精: $jin ($jin_per%) 气: $qi ($qi_per%) 神: $shen ($shen_per%) 杀气:$shaqi}
/prompt {^check status}{<039>※$myname※<099> 精: $jin ($jin_per%) 气: $qi ($qi_per%) 杀气:$shaqi}
/al fcks {/showme fight check status}
/var cks_l 0
/al cks_al {hp;/delay {0.2}{/showme check status}}
/al cks_rd {/al cks_al {hp;/delay {0.2}{/showme check status}}}
/al cks {cks_al;/al cks_al {/showme ---has check---};/delay {0.1}{cks_rd}}
/al clean_var {/var emy_sen 100;/var emy_kee 100;/var emy_name_en none;nokill;nwlk}
/ac {^Enemy:sen:%1/100}{/var emy_sen %1;/showme Getnpc}
/ac {^Enemy:kee:%1/100}{/var emy_kee %1;/showme Getnpc}
/prompt {^Getnpc}{<039>※$myname※<099>精:$jin 气:$qi 神:$shen 内力:$fce |$npc=血:$emy_kee 神:$emy_sen}
/ac {^fystatus:kee:%1/%2/%3}{/var qi %1;/showme Getnpc}
/ac {^fystatus:sen:%1/%2/%3}{/var shen %1;/showme Getnpc}
/ac {^fystatus:gin:%1/%2/%3}{/var jin %1;/showme Getnpc}
/ac {^fystatus:kee:%1/%2/%3;gin:%4/%5/%6;sen:%7/%8/%9}{/var qi %1;/var jin %4;/var shen %7;/showme Getnpc}
/ac {^fystatus:force:%1/%2}{/var fce %1;/var fce_m %2;/showme Getnpc}
/ac {^  谨慎的  宫南燕(Gong nanyan)	** 战斗中 **(LV89)}{}
