public class Device {
    //機器の名前
    private final String name;
    //機器のベンダー
    private final String vendor;
    //機器のタイプ(スイッチ、ルーター等)
    private final String type;
    //機器の価格

    //コントラクター
    public Device(String name, String vendor, String type) {
        this.name = name;
        this.vendor = vendor;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getVendor() {
        return vendor;
    }

    public String getType() {
        return type;
    }
}
