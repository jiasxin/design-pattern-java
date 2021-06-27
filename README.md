# design-pattern-java

- 基于刘伟教程《Java设计模式》

```text

│  .gitignore
│  design-pattern-java1.iml
│  pom.xml
│  README.md
│
├─.idea
│      .gitignore
│      compiler.xml
│      encodings.xml
│      jarRepositories.xml
│      misc.xml
│      uiDesigner.xml
│      vcs.xml
│      workspace.xml
│
├─src
│  ├─main
│  │  ├─java
│  │  │  └─com
│  │  │      └─mvn
│  │  │          └─designpattern
│  │  │              ├─chapter01
│  │  │              │  │  简单工厂模式.md
│  │  │              │  │
│  │  │              │  ├─demo01
│  │  │              │  │      Product.java
│  │  │              │  │      ProductA.java
│  │  │              │  │      ProductB.java
│  │  │              │  │      ProductFactory.java
│  │  │              │  │      Test.java
│  │  │              │  │
│  │  │              │  ├─demo02
│  │  │              │  │      Chart.java
│  │  │              │  │      ChartEnum.java
│  │  │              │  │      ChartFactory.java
│  │  │              │  │      ChartHistogram.java
│  │  │              │  │      ChartLine.java
│  │  │              │  │      ChartPie.java
│  │  │              │  │      Test.java
│  │  │              │  │
│  │  │              │  └─demo03
│  │  │              │          Test.java
│  │  │              │          Theme.java
│  │  │              │          ThemeBlue.java
│  │  │              │          ThemeEnum.java
│  │  │              │          ThemeFactory.java
│  │  │              │          ThemeRed.java
│  │  │              │
│  │  │              ├─chapter02
│  │  │              │  │  工厂方法模式.md
│  │  │              │  │
│  │  │              │  ├─demo01
│  │  │              │  │      DatabaseLogger.java
│  │  │              │  │      DatabaseLoggerFactory.java
│  │  │              │  │      FileLogger.java
│  │  │              │  │      FileLoggerFactory.java
│  │  │              │  │      Logger.java
│  │  │              │  │      LoggerFactory.java
│  │  │              │  │      Test.java
│  │  │              │  │
│  │  │              │  └─demo02
│  │  │              │          Test.java
│  │  │              │
│  │  │              ├─chapter03
│  │  │              │  │  抽象工厂模式.md
│  │  │              │  │
│  │  │              │  ├─demo01
│  │  │              │  │      AbstractFactory.java
│  │  │              │  │      AbstractProductPC.java
│  │  │              │  │      AbstractProductPhone.java
│  │  │              │  │      ConcreteFactoryHuawei.java
│  │  │              │  │      ConcreteFactoryXiaomi.java
│  │  │              │  │      ConcreteProductPCHuawei.java
│  │  │              │  │      ConcreteProductPCXiaomi.java
│  │  │              │  │      ConcreteProductPhoneHuawei.java
│  │  │              │  │      ConcreteProductPhoneXiaomi.java
│  │  │              │  │      Test.java
│  │  │              │  │
│  │  │              │  └─demo02
│  │  │              │          Button.java
│  │  │              │          MacButton.java
│  │  │              │          MacMenu.java
│  │  │              │          MacTheme.java
│  │  │              │          Menu.java
│  │  │              │          Test.java
│  │  │              │          Theme.java
│  │  │              │          WindowsButton.java
│  │  │              │          WindowsMenu.java
│  │  │              │          WindowsTheme.java
│  │  │              │
│  │  │              ├─chapter04
│  │  │              │  │  建造者模式.md
│  │  │              │  │
│  │  │              │  ├─demo01
│  │  │              │  │      Builder.java
│  │  │              │  │      ConcreteBuilder1.java
│  │  │              │  │      ConcreteBuilder2.java
│  │  │              │  │      Director.java
│  │  │              │  │      Product.java
│  │  │              │  │      Test.java
│  │  │              │  │
│  │  │              │  ├─demo02
│  │  │              │  │      Actor.java
│  │  │              │  │      ActorBuilder.java
│  │  │              │  │      ActorController.java
│  │  │              │  │      AngelActorBuilder.java
│  │  │              │  │      DevilActorBuilder.java
│  │  │              │  │      Test.java
│  │  │              │  │
│  │  │              │  ├─demo03
│  │  │              │  │      Actor.java
│  │  │              │  │      ActorBuilder.java
│  │  │              │  │      AngelActorBuilder.java
│  │  │              │  │      DevilActorBuilder.java
│  │  │              │  │      Test.java
│  │  │              │  │
│  │  │              │  ├─demo04
│  │  │              │  │      Actor.java
│  │  │              │  │      ActorBuilder.java
│  │  │              │  │      AngelActorBuilder.java
│  │  │              │  │      DevilActorBuilder.java
│  │  │              │  │      Test.java
│  │  │              │  │
│  │  │              │  └─demo05
│  │  │              │          Actor.java
│  │  │              │          ActorBuilder.java
│  │  │              │          ActorController.java
│  │  │              │          AngelActorBuilder.java
│  │  │              │          DevilActorBuilder.java
│  │  │              │          Test.java
│  │  │              │
│  │  │              ├─chapter05
│  │  │              │  │  原型模式.md
│  │  │              │  │
│  │  │              │  ├─demo01
│  │  │              │  │      ConcretePrototype.java
│  │  │              │  │      Prototype.java
│  │  │              │  │      Test.java
│  │  │              │  │
│  │  │              │  ├─demo02
│  │  │              │  │      ConcretePrototype.java
│  │  │              │  │      Test.java
│  │  │              │  │
│  │  │              │  └─demo03
│  │  │              │          ConcretePrototype.java
│  │  │              │          FileInfo.java
│  │  │              │          Test.java
│  │  │              │
│  │  │              ├─chapter06
│  │  │              │  │  单例模式.md
│  │  │              │  │
│  │  │              │  ├─demo01
│  │  │              │  │      Singleton.java
│  │  │              │  │      Test.java
│  │  │              │  │
│  │  │              │  ├─demo02
│  │  │              │  │      LoadBlancer.java
│  │  │              │  │      LoadBlancerMode.java
│  │  │              │  │      Test.java
│  │  │              │  │
│  │  │              │  └─demo03
│  │  │              │          EagerSingleton.java
│  │  │              │          InnerSingleton.java
│  │  │              │          LazySingleton.java
│  │  │              │          PerformanceTest.java
│  │  │              │
│  │  │              ├─chapter07
│  │  │              │  │  适配器模式.md
│  │  │              │  │
│  │  │              │  ├─demo01
│  │  │              │  │      Controller.java
│  │  │              │  │      PoliceAdapter.java
│  │  │              │  │      PoliceLamp.java
│  │  │              │  │      PoliceSound.java
│  │  │              │  │      Test.java
│  │  │              │  │      UfoAdapter.java
│  │  │              │  │      UfoLamp.java
│  │  │              │  │      UfoSound.java
│  │  │              │  │
│  │  │              │  ├─demo02
│  │  │              │  │      AbstractServiceClass.java
│  │  │              │  │      ConcreteServiceClass.java
│  │  │              │  │      ServiceInterface.java
│  │  │              │  │
│  │  │              │  └─demo03
│  │  │              │          Adaptee.java
│  │  │              │          Adapter.java
│  │  │              │          ConcreteAdaptee.java
│  │  │              │          ConcreteTarget.java
│  │  │              │          Target.java
│  │  │              │          Test.java
│  │  │              │
│  │  │              ├─chapter08
│  │  │              │  │  桥接模式.md
│  │  │              │  │
│  │  │              │  ├─demo01
│  │  │              │  │      Abstraction.java
│  │  │              │  │      ConcreteImplementor.java
│  │  │              │  │      Implementor.java
│  │  │              │  │      RefinedAbstraction.java
│  │  │              │  │
│  │  │              │  └─demo02
│  │  │              │          AbstractImage.java
│  │  │              │          BMPImage.java
│  │  │              │          Client.java
│  │  │              │          config.xml
│  │  │              │          GIFImage.java
│  │  │              │          Image.java
│  │  │              │          JPGImage.java
│  │  │              │          LinuxImageImpl.java
│  │  │              │          Matrix.java
│  │  │              │          PNGImage.java
│  │  │              │          Test.java
│  │  │              │          UnixImageImpl.java
│  │  │              │          WindowsImageImpl.java
│  │  │              │          XMLUtil.java
│  │  │              │
│  │  │              ├─chapter09
│  │  │              │  │  组合模式.md
│  │  │              │  │
│  │  │              │  ├─demo01
│  │  │              │  │      AbstractFile.java
│  │  │              │  │      Client.java
│  │  │              │  │      Folder.java
│  │  │              │  │      ImageFile.java
│  │  │              │  │      TextFile.java
│  │  │              │  │      VideoFile.java
│  │  │              │  │
│  │  │              │  └─demo02
│  │  │              ├─chapter10
│  │  │              │  │  装饰模式.md
│  │  │              │  │
│  │  │              │  ├─demo01
│  │  │              │  │      BlackBorderDecorator.java
│  │  │              │  │      Client.java
│  │  │              │  │      Component.java
│  │  │              │  │      ComponentDecorator.java
│  │  │              │  │      ListBox.java
│  │  │              │  │      ScrollBarDecorator.java
│  │  │              │  │      TextBox.java
│  │  │              │  │      Window.java
│  │  │              │  │
│  │  │              │  └─demo02
│  │  │              ├─chapter11
│  │  │              │  │  外观模式.md
│  │  │              │  │
│  │  │              │  ├─demo01
│  │  │              │  │      AbstractEncryptFacade.java
│  │  │              │  │      CipherMachine.java
│  │  │              │  │      Client.java
│  │  │              │  │      config.xml
│  │  │              │  │      des.txt
│  │  │              │  │      EncryptFacade.java
│  │  │              │  │      FileReader.java
│  │  │              │  │      FileWriter.java
│  │  │              │  │      NewCipherMachine.java
│  │  │              │  │      NewEncryptFacade.java
│  │  │              │  │      src.txt
│  │  │              │  │      XMLUtil.java
│  │  │              │  │
│  │  │              │  └─demo02
│  │  │              ├─chapter12
│  │  │              │  │  享元模式.md
│  │  │              │  │
│  │  │              │  ├─demo01
│  │  │              │  │      BlackIgoChessman.java
│  │  │              │  │      Client.java
│  │  │              │  │      IgoChessman.java
│  │  │              │  │      IgoChessmanFactory.java
│  │  │              │  │      WhiteIgoChessman.java
│  │  │              │  │
│  │  │              │  └─demo02
│  │  │              │          BlackIgoChessman.java
│  │  │              │          Client.java
│  │  │              │          Coordinates.java
│  │  │              │          IgoChessman.java
│  │  │              │          IgoChessmanFactory.java
│  │  │              │          WhiteIgoChessman.java
│  │  │              │
│  │  │              ├─chapter13
│  │  │              │  │  代理模式.md
│  │  │              │  │
│  │  │              │  ├─demo01
│  │  │              │  │      AccessValidator.java
│  │  │              │  │      Client.java
│  │  │              │  │      config.xml
│  │  │              │  │      Logger.java
│  │  │              │  │      ProxySearcher.java
│  │  │              │  │      RealSearcher.java
│  │  │              │  │      Searcher.java
│  │  │              │  │      XMLUtil.java
│  │  │              │  │
│  │  │              │  └─demo02
│  │  │              │          AbstractDocumentDAO.java
│  │  │              │          AbstractUserDAO.java
│  │  │              │          Client.java
│  │  │              │          DAOLogHandler.java
│  │  │              │          DocumentDAO.java
│  │  │              │          UserDAO.java
│  │  │              │
│  │  │              ├─chapter14
│  │  │              │  │  职责链模式.md
│  │  │              │  │
│  │  │              │  ├─demo01
│  │  │              │  │      Approver.java
│  │  │              │  │      Client.java
│  │  │              │  │      Congress.java
│  │  │              │  │      Director.java
│  │  │              │  │      Manager.java
│  │  │              │  │      President.java
│  │  │              │  │      PurchaseRequest.java
│  │  │              │  │      VicePresident.java
│  │  │              │  │
│  │  │              │  └─demo02
│  │  │              ├─chapter15
│  │  │              │  │  命令模式.md
│  │  │              │  │
│  │  │              │  ├─demo01
│  │  │              │  │      Client.java
│  │  │              │  │      Command.java
│  │  │              │  │      config.xml
│  │  │              │  │      DisplayHelpClass.java
│  │  │              │  │      ExitCommand.java
│  │  │              │  │      FunctionButton.java
│  │  │              │  │      HelpCommand.java
│  │  │              │  │      SystemExitClass.java
│  │  │              │  │      XMLUtil.java
│  │  │              │  │
│  │  │              │  ├─demo02
│  │  │              │  │      AbstractCommand.java
│  │  │              │  │      AddCommand.java
│  │  │              │  │      Adder.java
│  │  │              │  │      CalculatorForm.java
│  │  │              │  │      Client.java
│  │  │              │  │
│  │  │              │  └─demo03
│  │  │              │          Client.java
│  │  │              │          Command.java
│  │  │              │          CommandQueue.java
│  │  │              │          DisplayHelpClass.java
│  │  │              │          ExitCommand.java
│  │  │              │          HelpCommand.java
│  │  │              │          Invoker.java
│  │  │              │          SystemExitClass.java
│  │  │              │
│  │  │              ├─chapter16
│  │  │              │  │  解释器模式.md
│  │  │              │  │
│  │  │              │  └─demo01
│  │  │              │          AbstractNode.java
│  │  │              │          ActionNode.java
│  │  │              │          AndNode.java
│  │  │              │          Client.java
│  │  │              │          DirectionNode.java
│  │  │              │          DistanceNode.java
│  │  │              │          InstructionHandler.java
│  │  │              │          SentenceNode.java
│  │  │              │
│  │  │              └─chapter17
│  │  │                  │  迭代器模式.md
│  │  │                  │
│  │  │                  └─demo01
│  │  │                          AbstractIterator.java
│  │  │                          AbstractObjectList.java
│  │  │                          Client.java
│  │  │                          ProductIterator.java
│  │  │                          ProductList.java
│  │  │
│  │  └─resources
│  │          config.properties


```



