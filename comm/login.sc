/var reconn 0
/al autoreconn {/var reconn 1}
/al notreconn {/var reconn 0}
/ac {^Ŀǰ���ַ����Ǽ���}{/unticker {noidle}}
/ac {^����������Ӣ������}{$myname}
/ac {^�����ɫ�Ѿ����ڣ�������ý�ɫ�����룺$}{$passwd}
/ac {^����������������� 3 ����Զ�������Ϸ}{/cr}
/ac {^��Ҫ����һ�������е���ͬ����ϳ�ȥ��ȡ����֮��(y/n)$}{/if {$reconn==1}{y}}
/ac {^�����߽������߹�����$}{noidle}
/ac {^����������ϡ�$}{noidle}
