/nop newid register
/var xing {��}
/var ming {Į}
/var sex  {m}
/nop 1.��������  2.������  3.�ĺ�����  4.���ռ�թ (choose 1-4) 
/var xingge {2}
/var washto {washto 21 21 18 20}
/ac {^����������Ӣ������} {$myname}
/ac {^ʹ��%w������ֽ��ᴴ��һ���µ�����}{y}
/ac {^������������}{$xing}
/ac {^������������}{$ming}
/ac {^���趨���Ĺ������룺}{seawolf}
/ac {^��������һ�����Ĺ�������}{seawolf}
/ac {^�����������ͨ���룺}{Sea123}
/ac {^��������һ����������}{Sea123}
/ac {^��Ҫ��������(m)�Ľ�ɫ��Ů��(f)�Ľ�ɫ��}{$sex}
/ac {^���ڣ������� reg ����email��ַ}{reg tang.fable@gmail.com}
/ac {^������ѡ��(choose)�Ľ�ɫ�Ը�����}{choose $xingge}
/ac {^��ѡ����%1���Ը񣬽����������ϴ(washto)�츳�ˡ�}{$washto}
/nop �����������ļ����У���֮�����츳��ӱ�� 
/ac {^�����������ļ����У�%1��%2��}{
    /if {"%1"=="��֮��" && "%2" == "�츳��ӱ"}{
        /ticker {noidle}{xixi}{60};
        }{
            suicide -f}
        }
/ac {^���������ȷ���Ļ����������Ĺ������룺}{seawolf}
/ac {^ֻ��Ұ�ú��˼���}{wield sword;kill ye tu}
/al xuewubo {
    /ac {^��һ������}{s;s;e;xue wu bo %1 150;w;n;n;sleep};
    /ac {^�������ĳ̶��Ѿ�������ʦ���ˡ�}{stopxuewubo}
}
/al stopxuewubo {/unac {^��һ������};
     /unac {^�������ĳ̶��Ѿ�������ʦ���ˡ�}   
}
