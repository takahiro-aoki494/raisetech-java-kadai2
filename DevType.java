public enum DevType {

    //初期値の設定、機器の種類
    SWITCH("Switch"), ROUTER("Router");

    //フィールド
    private final String type;

    //コントラクター
    private DevType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
