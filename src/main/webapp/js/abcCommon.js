let header = `
        <div>
        <img class="logo-img" src="/WORKSYSTEM/images/newlogo.png"/>
        </div>`;

let footer = `
    <p><a href="https://blog.csdn.net/qq_34312317 " class="common-a">制作人：刘政平</a></p>
    |
    <p>邮箱：1757266829@qq.com</p>
    |
    <p>QQ：1757266829</p>
`;

function triggerClick(flag) {
    if (flag == '1') {
        window.location = '../html/workRecord.html'
    }
    if (flag == '2') {
        window.location = '../html/staffMain.html'
    }
}


$(() => {
    $('header').append(header);
    $('footer').append(footer);
});