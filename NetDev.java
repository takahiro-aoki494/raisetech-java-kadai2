import java.util.List;

public class NetDev {
    public static void main(String[] args) {
        List<Device> DeviceList = List.of(new Device("Catalyst 3650 シリーズ ", "Cisco", "Switch"), new Device("Catalyst 9200 シリーズ ", "Cisco", "Switch"), new Device("Catalyst 8300 シリーズ ", "Cisco", "Router"), new Device("ASR 9000 シリーズ ", "Cisco", "Router"), new Device("EX4100 シリーズ ", "Juniper", "Switch"), new Device("EX3400 シリーズ ", "Juniper", "Switch"), new Device("MX10004 シリーズ ", "Juniper", "Router"), new Device("MX960 シリーズ ", "Juniper", "Router"));

        System.out.println("ネットワーク機器一覧");

        //リストの内容をすべて表示
        for (Device device : DeviceList) {
            System.out.println(device.getName());
            System.out.print("ベンダー：" + device.getVendor());
            System.out.println(" 種類：" + device.getType());

        }

        System.out.println("Ciscoのスイッチのみ表示");

        //ベンダーがCiscoかつタイプがSwitchの機器のみ表示
        for (Device device : DeviceList) {
            if (device.getVendor().equals("Cisco") && device.getType().equals("Switch")) {
                System.out.println(device.getName());
            }

        }
    }
}
