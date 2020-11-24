package pkg.Decorator;

public abstract class MaterialDecorator implements Material{
    protected Material decoratedMaterial;

    public MaterialDecorator(Material decoratedMaterial) {
        this.decoratedMaterial = decoratedMaterial;
    }

    public void wrap() {
        decoratedMaterial.wrap();
    }
}
