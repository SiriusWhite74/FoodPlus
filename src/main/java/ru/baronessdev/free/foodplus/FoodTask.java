package ru.baronessdev.free.foodplus;

import lombok.Value;
import org.bukkit.Material;

import java.util.List;

@Value
public class FoodTask {

    Material material;
    int chance;
    List<String> execute;
}
