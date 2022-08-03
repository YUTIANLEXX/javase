package com.yutianle.shopcar;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        //1、定义商品类。用于后期创建商品对象；

        //2、定义购物车对象，使用一个数组对象表示；
        ShopCar[] goods = new ShopCar[100]; //默认null

        Scanner sc = new Scanner(System.in);
        while (true) {
            //3、搭建操作架构；
            System.out.println("请您选择如下命令进行操作：");
            System.out.println("添加商品到购物车：add");
            System.out.println("查询购物车已添商品：query");
            System.out.println("修改商品购买数量：update");
            System.out.println("结算购物车商品的金额：pay");
            System.out.println("请您输入命令：");
            String command = sc.next();
            switch (command) {
                case "add":
                    AddGoods(goods, sc);
                    //添加商品到购物车
                    break;
                case "query":
                    QueryGoods(goods);
                    //查询购物车商品展示
                    break;
                case "update":
                    UpdateGoods(goods, sc);
                    //修改商品的购买数量
                    break;
                case "pay":
                    Pay(goods);
                    //结算金额
                    break;
                default:
                    System.out.println("输入错误，请重新输入！");
                    break;
            }
        }
    }

    private static void Pay(ShopCar[] goods) {

        QueryGoods(goods);
        //定义一个求和变量累加金额
        double money = 0;

        //遍历购物车数组中的全部商品对象，累加单价*数量
        for (int i = 0; i < goods.length; i++) {
            ShopCar sh = goods[i];
            if(sh != null) {
                money += (sh.prices * sh.buyNumber);
            }else {
                break;
            }
        }
        System.out.println("订单总金额：" + money);
    }

    private static void UpdateGoods(ShopCar[] goods, Scanner sc) {

        while (true) {
            //用户输入要修改商品的id，根据id查询出要修改的商品对象
            System.out.println("请您输入要修改的商品id：");
            int id = sc.nextInt();
            ShopCar sh = getGoodById(goods, id);

            if(sh == null) {
                System.out.println("对不起，没有购买商品！");
            }else {
                System.out.println("请你输入，" + sh.buyNumber + "商品最新购买数量：");
                int buyNumber = sc.nextInt();
                sh.buyNumber = buyNumber;
                System.out.println("修改完成！");
                QueryGoods(goods);
                break;
            }
        }
    }

    public static ShopCar getGoodById(ShopCar[] goods, int id) {

        for (int i = 0; i < goods.length; i++) {
            ShopCar sh = goods[i];
            if(sh != null) {
                //判断这个对象的id是否我们要找的
                if(sh.id == id) {
                    return sh;
                }
            }else {
                return null;
            }
        }
        return null;
    }

    private static void QueryGoods(ShopCar[] goods) {

        System.out.println("===========查询购物车信息如下===========");
        System.out.println("编号\t\t名称\t\t\t\t价格\t\t\t\t购买数量");
        for (int i = 0; i < goods.length; i++) {
            ShopCar sh = goods[i];
            if(sh != null) {
                //展示商品对象
                System.out.println(sh.id + "\t\t" + sh.name + "\t\t\t\t" + sh.prices + "\t\t\t\t" + sh.buyNumber);
            }else{
                //遍历结束
                break;
            }
        }
    }

    private static void AddGoods(ShopCar[] goods, Scanner sc) {
        //1、录入信息
        System.out.println("请您输入购买商品的编号（不重复）：");
        int id = sc.nextInt();
        System.out.println("请您输入购买商品的名称：");
        String name = sc.next();
        System.out.println("请您输入购买商品的数量：");
        int buyNumber = sc.nextInt();
        System.out.println("请您输入购买商品的价格：");
        double prices = sc.nextDouble();

        //2、把购买商品的信息封装成一个商品对象
        ShopCar sh = new ShopCar();
        sh.id = id;
        sh.name = name;
        sh.buyNumber = buyNumber;
        sh.prices = prices;

        //3、把商品对象添加到购物车数组中去
        for (int i = 0; i < goods.length; i++) {
            if(goods[i] == null){
                goods[i] = sh;
                break;
            }
        }
        System.out.println("您的商品：" + sh.name + "添加到购物车完成！");
    }
}
