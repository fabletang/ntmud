/config speedwalk off
/nop �趨�س�ֻ�������ϴε����
/config {MCCP}     {off}
/config {repeat enter} on
/config {ECHO COMMAND} on
/config {SCROLL LOCK} on
/config {CONNECT RETRY} 30
/config {DEBUG TELNET} off
/config {CONVERT META} off
/split 0 1
/variable is_kill 0
/variable can_eat 1
/al de0 {/delay {0.5}%1}
/al de1 {/delay {1}{%1}}
/al de2 {/delay {2}{%1}}
/al de3 {/delay {3}{%1}}
/al de4 {/delay {4}{%1}}
/al de5 {/delay {5}{%1}}
/al de6 {/delay {6}{%1}}
/al de7 {/delay {7}{%1}}
/al de8 {/delay {8}{%1}}
/al de9 {/delay {9}{%1}}
/al de10 {/delay {10}{%1}}
/al de11 {/delay {11}{%1}}
/al de12 {/delay {12}{%1}}
/al de13 {/delay {13}{%1}}
/al de14 {/delay {14}{%1}}
/format ttfile {%s.tt}{$myname}
/al reload {/read $ttfile}
/ac {^#SESSION '%0' DIED.}{reload}
/ac {^#SESSION '%0' ACTIVATED.}{reload}
/ac {^�㲻����һ�����ͳ���ô������Ϣ}{
    /showme ---todo------;
}
/al iskill {/var is_kill 1}
/al nokill {/var is_kill 0}
/var is_walk 0
/al wlk {/var is_walk 1; /var at_tj 0;follow none}
/al nwlk {/delay {2}{/var is_walk 0}}
/nop ����
/al zuoqi {whistle;ride %0}
/ac {^������˹�����} {play qin; /delay {2}{pawn qin}}
/ac {^  �������� �����ʹ(Giftman)}{ask giftman about weapon}
/al wearshouhuan {remove finger;remove finger 2;remove finger 3;wear shouhuan}
/al dropshouhuan {dd shouhuan}
/al removeshouhuan {remove shouhuan;wear finger 3;wear finger 2;wear finger 1}
/al dd {remove %0;drop %0}
/ac {^�����޷�ʹ������}{stopk}
/ac {^�����޷�ʹ���⹦��}{stopk}
/ac {^��ž����һ��һ}{get dan;get wan;get xiandan;cun dan;get gold;get silver}{1}
/ac {^��ž����һ��һЩ�ƽ�}{get gold}
/ac {^��ž����һ��һЩ����}{get silver}
/al uptimedo {/al uptime_do %0}
/nop qiankundai 
/nop {^[24]  �����ֻ�(shouhuan)                        1}
/nop qiankun bag
/al qstore {sb;remove %0;unwield %0;store %0}
/var it_sn 0
/var it_num 1
/var it_code shouhuan1
/al qt {/var it_code {%0};sb;llb;
    /showme ==want take $it_code;
} 
/ac {^[%1]  %0(%3)%s%4}{
    /var it_sn %1;
    /var it_num %4;
    /if {"$it_code"=="%3"}{
                    take %1 %4;
                            };
    /nop showme == $it_sn %0 %3 $it_num ==
} 
/ac {^[%1]  %0(%5 %6)%s%4}{
    /var it_sn %1;
    /var it_num %4;
    /if {"$it_code"=="%5 %6"}{
                    /if {"$it_code"="zhufu sword"}{
                    take %1 %4;
                    }{take %1 1};
                    /var it_code none;
                            };
    /nop showme ----- $it_sn %0 %5 %6 $it_num ----- 
}{4} 
/ac {^�������Ǭ������}{/var it_code shouhuan1}
/ac {^�����%0������Ǭ����}{/var it_code none}
/ac {^��ײ�˴��ˣ��õ����⽱������%1��}{store %1}
/al qq {quest}
/al eatall {drink hulu;de4 {eat mantou}}
/ac {^== δ�����}{/cr}
/al hfall {fyz;rideto wumiao;ask nan xian about �ָ�}
/ac {^������������Ҫ��15������������������ʩչ������������}{/unticker k;s;hfall;de1 {rd haigui};de3 {/ticker {k}{drop coin;k}{2}}}
