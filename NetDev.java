import java.util.List;

public class NetDev {
    public static void main(String[] args) {
        //ネットワーク機器の情報を格納したリストを作成
        List<Device> DeviceList = List.of(
                new Device("Catalyst 3650 シリーズ ", "Cisco", DevType.SWITCH),
                new Device("Catalyst 9200 シリーズ ", "Cisco", DevType.SWITCH),
                new Device("Catalyst 8300 シリーズ ", "Cisco", DevType.ROUTER),
                new Device("ASR 9000 シリーズ ", "Cisco", DevType.ROUTER),
                new Device("EX4100 シリーズ ", "Juniper", DevType.SWITCH),
                new Device("EX3400 シリーズ ", "Juniper", DevType.SWITCH),
                new Device("MX10004 シリーズ ", "Juniper", DevType.ROUTER),
                new Device("MX960 シリーズ ", "Juniper", DevType.ROUTER));

        System.out.println("ネットワーク機器一覧");
        System.out.println("----------------------------------");

        //リストの内容をすべて表示
        for (Device device : DeviceList) {
            System.out.println(device.getName());
            System.out.print("ベンダー：" + device.getVendor());
            System.out.println(" 種類：" + device.getType());
            System.out.println("----------------------------------");
        }

        System.out.println(" ");
        System.out.println("Ciscoのスイッチのみ表示");

        //ベンダーがCiscoかつタイプがSwitchの機器のみ表示
        for (Device device : DeviceList) {
            if (device.getVendor().equals("Cisco") && device.getType().equals("Switch")) {
                System.out.println(device.getName());
            }
        }
    }
}
