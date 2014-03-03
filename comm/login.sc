/var reconn 0
/al autoreconn {/var reconn 1}
/al notreconn {/var reconn 0}
/ac {^目前的字符集是简体}{/unticker {noidle}}
/ac {^请输入您的英文名字}{$myname}
/ac {^这个角色已经存在，请输入该角色的密码：$}{$passwd}
/ac {^请输入任意键继续或 3 秒后自动进入游戏}{/cr}
/ac {^您要将另一个连线中的相同人物赶出去，取而代之吗？(y/n)$}{/if {$reconn==1}{y}}
/ac {^你连线进入王者归来。$}{noidle}
/ac {^重新连线完毕。$}{noidle}
