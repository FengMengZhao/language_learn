### 代理(proxy)模式(Structural)

- 为另外一个对象提供一个替身或者占位符以提供对这个对象的访问
    - 委托对象可以是远程的对象
        - 远程代理控制访问创建开销大的资源
    - 创建开销大的对象或者需要安全控制对象
        - 保护代理基于权限控制对资源的访问
        - 虚拟代理控制访问创建开销大的资源
- Controls and accessing the Object is either remote or too large to duplicate
