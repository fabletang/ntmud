/nop newid register
/var xing {北}
/var ming {漠}
/var sex  {m}
/nop 1.光明磊落  2.狡黠多变  3.心狠手辣  4.阴险奸诈 (choose 1-4) 
/var xingge {2}
/var washto {washto 21 21 18 20}
/ac {^请输入您的英文名字} {$myname}
/ac {^使用%w这个名字将会创造一个新的人物}{y}
/ac {^您的中文姓氏}{$xing}
/ac {^您的中文名字}{$ming}
/ac {^请设定您的管理密码：}{seawolf}
/ac {^请再输入一次您的管理密码}{seawolf}
/ac {^请输入你的普通密码：}{Sea123}
/ac {^请再输入一次您的密码}{Sea123}
/ac {^您要扮演男性(m)的角色或女性(f)的角色？}{$sex}
/ac {^现在，请输入 reg 您的email地址}{reg tang.fable@gmail.com}
/ac {^您可以选择(choose)的角色性格如下}{choose $xingge}
/ac {^你选择了%1的性格，接下来你可以洗(washto)天赋了。}{$washto}
/nop 你与生俱来的技能有：狂暴之力、天赋聪颖。 
/ac {^你与生俱来的技能有：%1、%2。}{
    /if {"%1"=="狂暴之力" && "%2" == "天赋聪颖"}{
        /ticker {noidle}{xixi}{60};
        }{
            suicide -f}
        }
/ac {^考虑清楚，确定的话请输入您的管理密码：}{seawolf}
/ac {^只听野兔嚎了几声}{wield sword;kill ye tu}
/al xuewubo {
    /ac {^你一觉醒来}{s;s;e;xue wu bo %1 150;w;n;n;sleep};
    /ac {^这项技能你的程度已经不输你师父了。}{stopxuewubo}
}
/al stopxuewubo {/unac {^你一觉醒来};
     /unac {^这项技能你的程度已经不输你师父了。}   
}
